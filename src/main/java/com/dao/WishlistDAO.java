package com.dao;

import java.util.List;

import com.firststep.model.Wishlist;

public interface WishlistDAO 
{
	 public void addToWishlist(Wishlist wishlist);
	 public List<Wishlist> WishlistList();
	 public String stringWishlist();
	 public void SaveOrUpdate(Wishlist wishlist);
	 public Wishlist getWishlistId(int wishlistId);
	 
	 public List<Wishlist> getUserById(int userId); 
	 public void deleteWishlist(int wishlistId);
}
