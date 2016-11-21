package com.firststep.config;

import org.springframework.stereotype.Component;

import com.firststep.model.BuyNow;
@Component 
public class CartHandler 
{
	
	public BuyNow initFlow()
	{
		return new BuyNow(); 
	}
	
}
