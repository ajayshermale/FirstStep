package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.daoimplementation.ProductFullViewDAOImpl;

import com.firststep.model.ProductFullView;

@Service
public class ProductFullViewService 
{
	@Autowired
	private ProductFullViewDAOImpl productFullViewDAOImpl;
	
	 @Transactional
     public String stringproductFullView()
	   {
		return productFullViewDAOImpl.stringproductFullView();   
	   }
	 
	 @Transactional
	 public ProductFullView getProductFullViewById(int productId)
	{
		
	 return productFullViewDAOImpl.getProductFullViewById(productId);
			 
	}	 
}