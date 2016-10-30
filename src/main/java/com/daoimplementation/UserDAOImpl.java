package com.daoimplementation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dao.UserDAO;
import com.firststep.model.Cart;
import com.firststep.model.User;
import com.firststep.model.UserDetail;
import com.firststep.model.UserRole;

@Repository
public class UserDAOImpl implements UserDAO
{
	@Autowired
	private SessionFactory sessionFactory;
	
	public void saveOrupdate(UserDetail userdetail)
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
		userRole.setRoleId(1);
		userRole.setUserId(newUser.getUserId());		
		session.saveOrUpdate(userRole);
		
		userdetail.setUserId(newCart.getUserId());
		userdetail.setCartId(newUser.getUserId());
	    userdetail.setRoleId(userRole.getRoleId());
		
		userdetail.getBillingAddress().setUserdetail(userdetail);
		userdetail.getShippingAddress().setUserdetail(userdetail);
		session.saveOrUpdate(userdetail.getBillingAddress());
		session.saveOrUpdate(userdetail.getShippingAddress());
		session.saveOrUpdate(userdetail);
       session.flush();
	}

	public void createAdmin(UserDetail userdetail) 
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
		
		userdetail.getBillingAddress().setUserdetail(userdetail);
		userdetail.getShippingAddress().setUserdetail(userdetail);
		session.saveOrUpdate(userdetail.getBillingAddress());
		session.saveOrUpdate(userdetail.getShippingAddress());
		session.saveOrUpdate(userdetail);
       session.flush();
		
	}

	public void createSupplier(UserDetail userdetail) 
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
		userRole.setRoleId(3);
		userRole.setUserId(newUser.getUserId());		
		session.saveOrUpdate(userRole);
		
		userdetail.setUserId(newCart.getUserId());
		userdetail.setCartId(newUser.getUserId());
	    userdetail.setRoleId(userRole.getRoleId());
		
		userdetail.getBillingAddress().setUserdetail(userdetail);
		userdetail.getShippingAddress().setUserdetail(userdetail);
		session.saveOrUpdate(userdetail.getBillingAddress());
		session.saveOrUpdate(userdetail.getShippingAddress());
		session.saveOrUpdate(userdetail);
       session.flush();
		
	}

}
