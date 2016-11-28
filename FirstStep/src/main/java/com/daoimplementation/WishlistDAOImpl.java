package com.daoimplementation;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dao.WishlistDAO;
import com.firststep.model.BillingAddress;
import com.firststep.model.Category;
import com.firststep.model.UserDetail;
import com.firststep.model.Wishlist;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Repository
public class WishlistDAOImpl implements WishlistDAO
{
	
	@Autowired
	private SessionFactory sessionFactory;

	public void addToWishlist(Wishlist wishlist) {
	
		sessionFactory.getCurrentSession().saveOrUpdate(wishlist);
	}
    
	@SuppressWarnings("unchecked")
	public List<Wishlist> WishlistList() {
		List<Wishlist> WishlistList = this.sessionFactory.getCurrentSession().createQuery("from Wishlist").getResultList();
		return WishlistList;
	}
	@SuppressWarnings("unchecked")
	public String stringWishlist() {
		Gson list = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
		List<Wishlist> WishlistList = sessionFactory.getCurrentSession().createQuery("from Wishlist").getResultList();
		String wishlistjson= list.toJson(WishlistList);
		return wishlistjson;	}
	
	@SuppressWarnings("unchecked")
	public Wishlist getWishlistId(int wishlistId) {
		String sql = "from Wishlist where wishlistId=" +wishlistId;
		List<Wishlist> wishlistlist = sessionFactory.getCurrentSession().createQuery(sql).getResultList();
		if(wishlistlist!=null && !wishlistlist.isEmpty())
		{
			return wishlistlist.get(0);
		}
		else return null;
	}

	public void SaveOrUpdate(Wishlist wishlist) {
		sessionFactory.getCurrentSession().saveOrUpdate(wishlist);
		
	}

	public List<Wishlist> getUserById(int userId) {
			String sql = "from Wishlist where userId= " +userId;
			List<Wishlist> list = sessionFactory.getCurrentSession().createQuery(sql).getResultList();
			if(list!=null && !list.isEmpty())
			{
				return list;
			}
			else return null;
		
	}

	public void deleteWishlist(int wishlistId) {
		Wishlist wishlistToDelete = new Wishlist();	
		wishlistToDelete.setWishlistId(wishlistId);
		   sessionFactory.getCurrentSession().delete(wishlistToDelete);
		
	}

}
