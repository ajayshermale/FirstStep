package com.firststep.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.firststep.model.BillingAddress;
import com.firststep.model.ShippingAddress;
import com.firststep.model.UserDetail;


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
		/*if(userDetail.getContactnumber().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"contactnumber").defaultText("contactnumber cannot be Empty").build());
			status = "failure";
		}*/
		return status;
	}
	
	@Autowired
	private ShippingAddress shippingAddress;
	
    @Transactional
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
	
	@Transactional
	public String addBillingAddress( BillingAddress billingAddress)
	{
		
		this.billingAddress.setLandmark(billingAddress.getLandmark());
		this.billingAddress.setState(billingAddress.getState());
		this.billingAddress.setCity(billingAddress.getCity());
		this.billingAddress.setPincode(billingAddress.getPincode());
		
		return "success";
		
	}
	
	
	
	
}

