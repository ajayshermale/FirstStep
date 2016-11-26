package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.daoimplementation.ProductDAOImpl;
import com.firststep.model.Product;

@Service
public class ProductService 
{
	@Autowired
	private ProductDAOImpl productDAOImpl;
    
	@Transactional
	 public void addproduct(Product product)
	 {
		productDAOImpl.createProduct(product); 
	 }
	
	@Transactional
	  public List<Product>listproduct()
	 {
	   return productDAOImpl.listproduct();
	  }
	
	 @Transactional
     public String stringproduct()
	   {
		return productDAOImpl.stringproduct();   
	   }
	 @Transactional
	 public void deleteProduct(int productId)
	 {
		productDAOImpl.deleteProduct(productId);
	 }
	 @Transactional
	  public Product getProductById(int productId)
	  {
		 return productDAOImpl.getProductById(productId);
		 
	  }
	 @Transactional
	 public void subProduct(int productId)
	 {
		  productDAOImpl.subProduct(productId);
	 }
	 @Transactional
	 public void addProduct(int productId)
	 {
		productDAOImpl.addProduct(productId); 
	 }
}
