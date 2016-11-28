package com.dao;

import java.util.List;

import com.firststep.model.BillingAddress;
import com.firststep.model.ShippingAddress;
import com.firststep.model.UserDetail;



public interface UserDAO {

	public void saveOrupdate(UserDetail userdetail);
   // public void createAdmin(UserDetail userdetail);
   // public void addRegisterAdmin(UserDetail userdetail);
	public void createSupplier(UserDetail userdetail);
    public List<UserDetail> UserDetailList();
    public UserDetail getUserName(String username); 
    
    public ShippingAddress getShippingAddress(int userId); 
    public BillingAddress getBillingAddress(int userId); 
    
   
}
