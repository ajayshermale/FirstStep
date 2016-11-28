package com.daoimplementation;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dao.CartItemDAO;
import com.firststep.model.CartItem;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Repository
public class CartItemDAOImpl implements CartItemDAO 
{
	
	@Autowired
	private SessionFactory sessionFactory;
	

	public void addToBuyNow(CartItem cartItem) 
	{
		 sessionFactory.getCurrentSession().saveOrUpdate(cartItem);
	
	}

	@SuppressWarnings("unchecked")
	public List<CartItem> CartItemList() {
		 List<CartItem> CartItemList = this.sessionFactory.getCurrentSession().createQuery("from CartItem").getResultList();
		return CartItemList;
	}

	@SuppressWarnings("unchecked")
	public String stringCartItem() {
		Gson list = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
		List<CartItem> CartItemList = sessionFactory.getCurrentSession().createQuery("from CartItem").getResultList();
		String cartItemjson= list.toJson(CartItemList);
		return cartItemjson;
	}

	public void SaveOrUpdate(CartItem cartItem) 
	{
		sessionFactory.getCurrentSession().saveOrUpdate(cartItem);
		
	}
	@SuppressWarnings("unchecked")
	public CartItem getCartItemId(int cartItemId) 
	{
		String sql = "from CartItem where cartItemId=" +cartItemId;
		List<CartItem> cartItemlist = sessionFactory.getCurrentSession().createQuery(sql).getResultList();
		if(cartItemlist!=null && !cartItemlist.isEmpty())
		{
			return cartItemlist.get(0);
		}
		else return null;
	}

}
