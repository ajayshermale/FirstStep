package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.daoimplementation.CartItemDAOImpl;
import com.firststep.model.CartItem;




@Service
public class CartItemService
{
	@Autowired
	private CartItemDAOImpl cartItemDAOImpl;
	
	@Transactional
	public void addToBuyNow(CartItem cartItem) 
	{
		cartItemDAOImpl.addToBuyNow(cartItem);
	}
	@Transactional
	public List<CartItem> CartItemList() {
		return this.cartItemDAOImpl.CartItemList();
	}
	@Transactional
	public String stringCartItem(){
		return cartItemDAOImpl.stringCartItem();
	}
	@Transactional
	public void SaveOrUpdate(CartItem cartItem) 
	{
		 cartItemDAOImpl.SaveOrUpdate(cartItem);			
	}
	 @Transactional
	 public CartItem getCartItemId(int cartItemId) 
	 {
		 return  cartItemDAOImpl.getCartItemId(cartItemId);
	 }

}
