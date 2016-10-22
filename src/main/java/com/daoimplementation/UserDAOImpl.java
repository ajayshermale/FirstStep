package com.daoimplementation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.dao.UserDAO;
import com.firststep.model.Cart;
import com.firststep.model.User;
import com.firststep.model.UserDetail;

public class UserDAOImpl implements UserDAO
{
	@Autowired
	private SessionFactory sessionFactory;
	public void saveOrupdate(UserDetail userdetail)
	{
		Session session=sessionFactory.getCurrentSession();
		User newUser=new User();
		newUser.setUserId(userdetail.getUserId());
		newUser.setUsername(userdetail.getUserlastname());
		newUser.setPassword(userdetail.getPassword());
		newUser.setEnabled(true);
		session.saveOrUpdate(newUser);
		
		Cart newCart=new Cart();
		newCart.setCartId(userdetail.getUserId());
		newCart.setUserId(userdetail.getUserId());
		session.saveOrUpdate(newCart);
		session.saveOrUpdate(newCart);
		
		UserRole userRole=new userRole();
		userRole
		
		
		
		
		
		
		
	}

}
