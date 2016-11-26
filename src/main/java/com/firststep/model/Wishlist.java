package com.firststep.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.google.gson.annotations.Expose;

@SuppressWarnings("serial")
@Entity
public class Wishlist implements Serializable{

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Expose
	private int wishlistId;
	@Expose
	private int cartId;
	@Expose
	private int userId;
	@Expose
	private int productId;
	@Expose
	private String productName;
	@Expose
	private String amount;
	@Expose
	private String rate;
	@Expose
	private String  quantity;
	@Expose
	private boolean flag;
	


	@ManyToOne
	@JoinColumn(name="userId" ,nullable=false,insertable=false,updatable=false)
	private User user;
	
	@ManyToOne
	@JoinColumn(name="productId" ,nullable=false,insertable=false,updatable=false)
	private Product product;
	
	@ManyToOne
	@JoinColumn(name="cartId" ,nullable=false,insertable=false,updatable=false)
	private Cart cart;
	
	@ManyToOne
	@JoinColumn(name="userId" ,nullable=false,insertable=false,updatable=false)
	private UserDetail userDetail;

	public UserDetail getUserDetail() {
		return userDetail;
	}

	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}

	public int getWishlistId() {
		return wishlistId;
	}

	public void setWishlistId(int wishlistId) {
		this.wishlistId = wishlistId;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
	
	
	
}
