package com.dao;

import java.util.List;

import com.firststep.model.CartItem;




public interface CartItemDAO 
{
   	 public void addToBuyNow(CartItem cartItem);
	 public List<CartItem> CartItemList();
	 public String stringCartItem();
	 public void SaveOrUpdate(CartItem cartItem);
	 public CartItem getCartItemId(int cartItemId);
	 
}
