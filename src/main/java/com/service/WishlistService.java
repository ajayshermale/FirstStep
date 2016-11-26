package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.daoimplementation.WishlistDAOImpl;
import com.firststep.model.Wishlist;

@Service
public class WishlistService 
{
	@Autowired
	private WishlistDAOImpl wishlistDAOImpl;
	
	@Transactional
	public void addToWishlist(Wishlist wishlist)
	{
		wishlistDAOImpl.addToWishlist(wishlist);
	}
	@Transactional
	public List<Wishlist> WishlistList()
	{
		return this.wishlistDAOImpl.WishlistList();
	}
	@Transactional
	public String stringWishlist(){
		return wishlistDAOImpl.stringWishlist();
	}
	 @Transactional
	 public Wishlist getWishlistId(int wishlistId)
	 {
		 return  wishlistDAOImpl.getWishlistId(wishlistId);
	 }
	 
	 @Transactional
     public void SaveOrUpdate(Wishlist wishlist)
		{
			wishlistDAOImpl.SaveOrUpdate(wishlist);
		}
	 @Transactional
	 public List<Wishlist> getUserById(int userId)
	 {
		 return wishlistDAOImpl.getUserById(userId);
	 }
	 @Transactional
     public void deleteWishlist(int wishlistId)
	{
		 wishlistDAOImpl.deleteWishlist(wishlistId);
		}
}
