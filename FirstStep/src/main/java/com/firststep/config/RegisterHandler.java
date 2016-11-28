package com.firststep.config;



import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.stereotype.Component;

import com.firststep.model.BillingAddress;
import com.firststep.model.ShippingAddress;
import com.firststep.model.Supplier;
import com.firststep.model.UserDetail;
import com.service.UserService;


@Component
public class RegisterHandler {

	public UserDetail initFlow(){
		return new UserDetail();
    }

	@Autowired
	private UserService userService;
	
	public String validateDetails(UserDetail userDetail,MessageContext messageContext){
		String status = "success";
		
		
		if(userDetail.getUsername().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"username").defaultText("UserName cannot be Empty").build());
			status = "failure";
		}
		
		if(userDetail.getPassword().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"password").defaultText("Password cannot be Empty").build());
			status = "failure";
		}
		
		if(userDetail.getUserfirstname().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"userfirstname").defaultText("UserFirstname cannot be Empty").build());
			status = "failure";
		}
		
		if(userDetail.getUserlastname().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"userlastname").defaultText("UserLastname cannot be Empty").build());
			status = "failure";
		}
		
		if(userDetail.getEmail().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"email").defaultText("Email cannot be Empty").build());
			status = "failure";
		}
		if(userDetail.getContactnumber().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"contactnumber").defaultText("Contact Number cannot be Empty").build());
			status = "failure";
		}
		return status;
	}
	
	public String duplicateUser(UserDetail userDetail,MessageContext messageContext){
		String status = "success";
		List<UserDetail> UserDetailList=userService.UserDetailList();
	for(UserDetail user:UserDetailList)
	{
		if(userDetail.getUsername().equals(user.getUsername())){
			messageContext.addMessage(new MessageBuilder().error().source(
					"username").defaultText("USER NAME EXIST").build());
			status = "failure";
		}
		
		if(userDetail.getEmail().equals(user.getEmail())){
			messageContext.addMessage(new MessageBuilder().error().source(
					"email").defaultText("EMAIL EXIST").build());
			status = "failure";
		}
		
		
	}
	
	return status;
}
	@Autowired
	private ShippingAddress shippingAddress;
	
	public String addShippingAddress(ShippingAddress shippingAddress)
	{
		
		
    	this.shippingAddress.setLandmark(shippingAddress.getLandmark());
		this.shippingAddress.setState(shippingAddress.getState());
		this.shippingAddress.setCity(shippingAddress.getCity());
		this.shippingAddress.setPincode(shippingAddress.getPincode());
		
	
		return "success";
		
	}
	
	@Autowired
	private BillingAddress billingAddress;
	
	public String addBillingAddress( BillingAddress billingAddress)
	{
	
		this.billingAddress.setLandmark(billingAddress.getLandmark());
		this.billingAddress.setState(billingAddress.getState());
		this.billingAddress.setCity(billingAddress.getCity());
		this.billingAddress.setPincode(billingAddress.getPincode());
		
	
		return "success";
	}
	
		
	

	public String saveOrUpdateUser(UserDetail userDetail, ShippingAddress shippingAddress,BillingAddress billingAddress)
	{
		userService.saveOrupdate(userDetail);
		shippingAddress.setUserdetail(userDetail);
		userDetail.setShippingAddress(shippingAddress);
		this.userService.addShippingAddress(shippingAddress);
		
		billingAddress.setUserdetail(userDetail);
		userDetail.setBillingAddress(billingAddress);
		this.userService.addBillingAddress(billingAddress);
		
		 Date date=new Date();
		 userDetail.setOrderDate(date);
		
				
		return "success";
		
	}
	
	
	
	
	
	
	@Autowired
	private Supplier supplier;
	
	
	public String addSupplierDetails(Supplier supplier)
	{
		this.supplier.setSupplierCompanyAddress(supplier.getSupplierCompanyAddress());
		this.supplier.setSupplierCompanyName(supplier.getSupplierCompanyName());
		this.supplier.setSupplierCity(supplier.getSupplierCity());
		this.supplier.setSupplierState(supplier.getSupplierState());
		this.supplier.setSupplierPincode(supplier.getSupplierPincode());
		this.supplier.setSupplierURL(supplier.getSupplierURL());
		
		
	    //this.userService.createSupplier(userDetail);
		//this.sessionFactory.getCurrentSession().saveOrUpdate(supplier);
		return "success";
		
	}

	
	public String saveOrUpdateSupplier(UserDetail userDetail,Supplier supplier )
	{
	    
		
		
		userService.createSupplier(userDetail);
		
	
		supplier.setUserdetail(userDetail);
		userDetail.setSupplier(supplier);
		this.userService.SaveOrUpdateSupplier(supplier);
		return "success";
		
	}
	
}

