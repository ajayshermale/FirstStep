package com.firststep.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class UserDetail {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int userId;
private String password;
private String userfirstname;
private String userlastname;
private String email;
private int contactnumber;
private int shippingaddressId;
private int billingaddressId;


public int getShippingaddressId() {
	return shippingaddressId;
}


public void setShippingaddressId(int shippingaddressId) {
	this.shippingaddressId = shippingaddressId;
}


public int getBillingaddressId() {
	return billingaddressId;
}


public void setBillingaddressId(int billingaddressId) {
	this.billingaddressId = billingaddressId;
}


@OneToOne
@JoinColumn(name="userId" ,nullable=false,insertable=false,updatable=false)
private User user;


public int getUserId() {
	return userId;
}


public void setUserId(int userId) {
	this.userId = userId;
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


public User getUser() {
	return user;
}


public void setUser(User user) {
	this.user = user;
}
public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}


}
