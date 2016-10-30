package com.firststep.model;

import java.io.Serializable;

import javax.persistence.Entity;



import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class UserDetail  implements Serializable {
@Id

private int userId;
private String password;
private String username;
private String userfirstname;
private String userlastname;
private String email;
private int contactnumber;
private int roleId;
private int cartId;


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

public int getContactnumber() {
	return contactnumber;
}

public void setContactnumber(int contactnumber) {
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

