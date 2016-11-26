package com.daoimplementation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Repository;


import com.dao.UserDAO;
import com.firststep.model.BillingAddress;
import com.firststep.model.Cart;

import com.firststep.model.ShippingAddress;
import com.firststep.model.Supplier;
import com.firststep.model.User;
import com.firststep.model.UserDetail;
import com.firststep.model.UserRole;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Repository
public class UserDAOImpl implements UserDAO
{
	@Autowired
	private SessionFactory sessionFactory;
	
	public void saveOrupdate(UserDetail userdetail)
	{
		Session session=sessionFactory.getCurrentSession();
		
		User newUser=new User();
		newUser.setUserId(userdetail.getUserId());
		newUser.setUsername(userdetail.getUsername());
		newUser.setPassword(userdetail.getPassword());
		newUser.setEnabled(true);
		userdetail.setUserId(newUser.getUserId());
		session.saveOrUpdate(newUser);
		
		Cart newCart=new Cart();
		newCart.setCartId(newUser.getUserId());
		newCart.setUserId(newUser.getUserId());
		session.saveOrUpdate(newCart);
		
		
		UserRole userRole=new UserRole();
		userRole.setRoleId(1);
		userRole.setUserId(newUser.getUserId());		
		session.saveOrUpdate(userRole);
		
		userdetail.setUserId(newUser.getUserId());
		userdetail.setCartId(newCart.getCartId());
	    userdetail.setRoleId(1);
		
//		userdetail.getBillingAddress().setUserdetail(userdetail);
//		userdetail.getShippingAddress().setUserdetail(userdetail);
//		session.saveOrUpdate(userdetail.getBillingAddress());
//		session.saveOrUpdate(userdetail.getShippingAddress());
//		
		session.saveOrUpdate(userdetail);
        session.flush();
	}

	
	@SuppressWarnings("unchecked")
	public List<UserDetail> UserDetailList() 
	{
		List<UserDetail> UserDetailList = this.sessionFactory.getCurrentSession().createQuery("from UserDetail").getResultList();
		return UserDetailList;
	}
	
	public void addShippingAddress(ShippingAddress shippingAddress)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(shippingAddress);
	}
	
	public void addBillingAddress(BillingAddress billingAddress)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(billingAddress);
	}

	
	/*public void createAdmin(UserDetail userdetail) 
	{

		Session session=sessionFactory.getCurrentSession();
		
		User newUser=new User();
		//newUser.setUserId(userdetail.getUserId());
		newUser.setUsername(userdetail.getUsername());
		newUser.setPassword(userdetail.getPassword());
		newUser.setEnabled(true);
		session.saveOrUpdate(newUser);
		
		Cart newCart=new Cart();
		newCart.setCartId(newUser.getUserId());
		newCart.setUserId(newUser.getUserId());
		session.saveOrUpdate(newCart);
		session.saveOrUpdate(newCart);
		
		UserRole userRole=new UserRole();
		userRole.setRoleId(2);
		userRole.setUserId(newUser.getUserId());		
		session.saveOrUpdate(userRole);
		
		userdetail.setUserId(newCart.getUserId());
		userdetail.setCartId(newUser.getUserId());
	    userdetail.setRoleId(userRole.getRoleId());
		
//		userdetail.getBillingAddress().setUserdetail(userdetail);
//		userdetail.getShippingAddress().setUserdetail(userdetail);
//		session.saveOrUpdate(userdetail.getBillingAddress());
//		session.saveOrUpdate(userdetail.getShippingAddress());
		session.saveOrUpdate(userdetail);
       session.flush();
		
	}*/


	//private Supplier supplier;
	public void createSupplier(UserDetail userdetail) 
	{
        Session session=sessionFactory.getCurrentSession();
		
		User newUser=new User();
		
		newUser.setUserId(userdetail.getUserId());
		newUser.setUsername(userdetail.getUsername());
		newUser.setPassword(userdetail.getPassword());
		newUser.setEnabled(true);
		userdetail.setUserId(newUser.getUserId());
		
		
		session.saveOrUpdate(newUser);
		
		Cart newCart=new Cart();
		newCart.setCartId(newUser.getUserId());
		newCart.setUserId(newUser.getUserId());
		session.saveOrUpdate(newCart);
		
		
		UserRole userRole=new UserRole();
		userRole.setRoleId(3);
		userRole.setUserId(newUser.getUserId());		
		session.saveOrUpdate(userRole);
		
		userdetail.setUserId(newUser.getUserId());
		userdetail.setCartId(newCart.getCartId());
	    userdetail.setRoleId(3);
	    
		//userdetail.getSupplier().setUserdetail(userdetail);
		//session.saveOrUpdate(userdetail.getSupplier());
		//userdetail.getBillingAddress().setUserdetail(userdetail);
    	//userdetail.getShippingAddress().setUserdetail(userdetail);
		//session.saveOrUpdate(userdetail.getBillingAddress());
		//session.saveOrUpdate(userdetail.getShippingAddress());
		session.saveOrUpdate(userdetail);
        session.flush();
		
	}

	

	public void SaveOrUpdateSupplier(Supplier supplier) {
		this.sessionFactory.getCurrentSession().saveOrUpdate(supplier);
		
	}
   
	@SuppressWarnings("unchecked")
	public List<Supplier> SupplierList() {
		List<Supplier> SupplierList=this.sessionFactory.getCurrentSession().createQuery("from Supplier").getResultList();
		return SupplierList;
	}
	
	
	@SuppressWarnings("unchecked")
	public Supplier getIdByName(String supplierCompanyName) 
	{
			String sql = "from Supplier where supplierCompanyName= '" +supplierCompanyName+"'";
			List<Supplier> list = sessionFactory.getCurrentSession().createQuery(sql).getResultList();
			if(list!=null && !list.isEmpty())
			{
				return list.get(0);
			}
			else return null;
		}
	
	@SuppressWarnings("unchecked")
	public String stringsupplier()
	{
	    Gson list = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
		List<Supplier> SupplierList = sessionFactory.getCurrentSession().createQuery("from Supplier").getResultList();
		String supplierjson= list.toJson(SupplierList);
		return supplierjson;
	}

@SuppressWarnings("unchecked")
public Supplier getSupplierById(int supplierAddressId) {
	String sql = "from Supplier where supplierAddressId=" +supplierAddressId;
	List<Supplier> supplierList = sessionFactory.getCurrentSession().createQuery(sql).getResultList();
	if(supplierList!=null && !supplierList.isEmpty())
	{
		return supplierList.get(0);
	}
	else return null;
 	}

//need to get userId
@SuppressWarnings("unchecked")
public UserDetail getUserName(String username) {
	
	 Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	 username = auth.getName(); 
	
	String sql = "from UserDetail where username= '" +username+"'";
	List<UserDetail> userDetailList = sessionFactory.getCurrentSession().createQuery(sql).getResultList();
	if(userDetailList!=null && !userDetailList.isEmpty())
	{
		return userDetailList.get(0);
	}
	else return null;
 	}


//shipping address for web flow
@SuppressWarnings("unchecked")
public ShippingAddress getShippingAddress(int userId) 
{
	String sql = "from ShippingAddress where UserDetail_userId= " +userId;
	List<ShippingAddress> list = sessionFactory.getCurrentSession().createQuery(sql).getResultList();
	if(list!=null && !list.isEmpty())
	{
		return list.get(0);
	}
	else return null;
}


public BillingAddress getBillingAddress(int userId) {
	
	String sql = "from BillingAddress where UserDetail_userId= " +userId;
	List<BillingAddress> list = sessionFactory.getCurrentSession().createQuery(sql).getResultList();
	if(list!=null && !list.isEmpty())
	{
		return list.get(0);
	}
	else return null;
}



	


}
