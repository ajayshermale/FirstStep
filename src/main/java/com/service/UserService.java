package com.service;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.daoimplementation.UserDAOImpl;
import com.firststep.model.BillingAddress;
import com.firststep.model.ShippingAddress;
import com.firststep.model.Supplier;

import com.firststep.model.UserDetail;

@Service
public class UserService {

	@Autowired
	private UserDAOImpl userDAOImpl;
	
	@Transactional
	public void saveOrupdate(UserDetail userdetail)
	{
		this.userDAOImpl.saveOrupdate(userdetail);
	}
	
	@Transactional
	public void createSupplier(UserDetail userdetail)
	{
		this.userDAOImpl.createSupplier(userdetail);
	}
	
//	@Transactional
//	public void createAdmin(UserDetail userdetail) 
//	{
//		
//        this.userDAOImpl.createAdmin(userdetail);
//	}
//	
	
	@Transactional
	public void addShippingAddress(ShippingAddress shippingAddress)
	{
		this.userDAOImpl.addShippingAddress(shippingAddress);
	}
	
	@Transactional
	public void addBillingAddress(BillingAddress billingAddress)
	{
		this.userDAOImpl.addBillingAddress(billingAddress);
	}
	
	
	@Transactional
	public List<UserDetail> UserDetailList()  {
		return this.userDAOImpl.UserDetailList();
	}
	
	
	
	@Transactional
	public List<Supplier> SupplierList(){
		return this.userDAOImpl.SupplierList();
		}
	
	@Transactional
	public void SaveOrUpdateSupplier(Supplier supplier)
	{
		userDAOImpl.SaveOrUpdateSupplier(supplier);
	}
	
	 @Transactional
      public Supplier getIdByName(String supplierCompanyName)
	 {
	    	
		    return userDAOImpl.getIdByName(supplierCompanyName);
	    	
	    }
       @Transactional
       public String stringsupplier()
   	{
    	 return userDAOImpl.stringsupplier();  
   	}
   
       @Transactional
       public Supplier getSupplierById(int supplierAddressId)
   	{
    	 return userDAOImpl.getSupplierById(supplierAddressId);  
   	} 
       
       @Transactional
       public UserDetail getUserName(String username)
       {
    	  
    	   return userDAOImpl.getUserName(username);
    	   
       }
       
       @Transactional
       public ShippingAddress getShippingAddress(int userId)
       {
    	return userDAOImpl.getShippingAddress(userId);
       }
       
       @Transactional
       public  BillingAddress getBillingAddress(int userId)
       {
    	return userDAOImpl.getBillingAddress(userId);
       }
}       
