package com.firststep.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;



import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.google.gson.annotations.Expose;

@SuppressWarnings("serial")
@Entity
public class UserDetail  implements Serializable {
@Id
@Expose
private int userId;
@Expose
private String password;
@Expose
private String username;
@Expose
private String userfirstname;
@Expose
private String userlastname;
@Expose
private String email;
@Expose
private String contactnumber;
@Expose
private int roleId;
@Expose
private int cartId;
@Expose
private Date orderDate;



public Date getOrderDate() {
	return orderDate;
}

public void setOrderDate(Date orderDate) {
	this.orderDate = orderDate;
}

@OneToOne
@JoinColumn(name="userId" ,nullable=false,insertable=false,updatable=false)
private User users;

@OneToOne
@JoinColumn(name="cartId" ,nullable=false,insertable=false,updatable=false)
private Cart cart;

@OneToOne
@JoinColumn(name="shippingaddressId" )
private ShippingAddress shippingAddress;

@OneToOne
@JoinColumn(name="billingaddressId" )
private BillingAddress billingAddress;

@OneToOne
@JoinColumn(name="roleId" ,nullable=false,insertable=false,updatable=false)
private Role role;

@OneToOne
@JoinColumn(name="supplierAddressId")

private Supplier supplier;


public Supplier getSupplier() {
	return supplier;
}

public void setSupplier(Supplier supplier) {
	this.supplier = supplier;
}

public Role getRole() {
	return role;
}

public void setRole(Role role) {
	this.role = role;
}

public int getUserId() {
	return userId;
}


public void setUserId(int userId) {
	this.userId = userId;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getUserfirstname() {
	return userfirstname;
}

public void setUserfirstname(String userfirstname) {
	this.userfirstname = userfirstname;
}

public String getUserlastname() {
	return userlastname;
}

public void setUserlastname(String userlastname) {
	this.userlastname = userlastname;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}



public String getContactnumber() {
	return contactnumber;
}

public void setContactnumber(String contactnumber) {
	this.contactnumber = contactnumber;
}

public int getCartId() {
	return cartId;
}

public void setCartId(int cartId) {
	this.cartId = cartId;
}

public User getUsers() {
	return users;
}

public void setUsers(User users) {
	this.users = users;
}

public Cart getCart() {
	return cart;
}

public void setCart(Cart cart) {
	this.cart = cart;
}

public ShippingAddress getShippingAddress() {
	return shippingAddress;
}

public void setShippingAddress(ShippingAddress shippingAddress) {
	this.shippingAddress = shippingAddress;
}

public BillingAddress getBillingAddress() {
	return billingAddress;
}

public void setBillingAddress(BillingAddress billingAddress) {
	this.billingAddress = billingAddress;
}
public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public int getRoleId() {
	return roleId;
}

public void setRoleId(int roleId) {
	this.roleId = roleId;
}

}

