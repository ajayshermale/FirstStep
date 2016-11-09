package com.firststep.config;


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

	public String validateDetails(UserDetail userDetail,MessageContext messageContext){
		String status = "success";
		if(userDetail.getUsername().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"username").defaultText("username cannot be Empty").build());
			status = "failure";
		}
		
		if(userDetail.getEmail().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"email").defaultText("Email cannot be Empty").build());
			status = "failure";
		}
		if(userDetail.getContactnumber().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"contactnumber").defaultText("contact number cannot be Empty").build());
			status = "failure";
		}
		return status;
	}
	
	
	@Autowired
	private ShippingAddress shippingAddress;
	
	@Autowired
	private BillingAddress billingAddress;
	
	
	public String addShippingAddress(ShippingAddress shippingAddress)
	{
		
		
    	this.shippingAddress.setLandmark(shippingAddress.getLandmark());
		this.shippingAddress.setState(shippingAddress.getState());
		this.shippingAddress.setCity(shippingAddress.getCity());
		this.shippingAddress.setPincode(shippingAddress.getPincode());
		
	
		return "success";
		
	}
	
	
	
	public String addBillingAddress( BillingAddress billingAddress)
	{
	
		this.billingAddress.setLandmark(billingAddress.getLandmark());
		this.billingAddress.setState(billingAddress.getState());
		this.billingAddress.setCity(billingAddress.getCity());
		this.billingAddress.setPincode(billingAddress.getPincode());
		
	
		return "success";
	}

		
	@Autowired
	private UserService userService;	
	

	public String saveOrUpdateUser(UserDetail userDetail, ShippingAddress shippingAddress,BillingAddress billingAddress)
	{
		userService.saveOrupdate(userDetail);
		shippingAddress.setUserdetail(userDetail);
		userDetail.setShippingAddress(shippingAddress);
		this.userService.addShippingAddress(shippingAddress);
		
		billingAddress.setUserdetail(userDetail);
		userDetail.setBillingAddress(billingAddress);
		this.userService.addBillingAddress(billingAddress);
		
		
				
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

