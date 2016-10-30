package com.firststep.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class BillingAddress implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int billingaddressId;
	private String landmark;
	private String state;
	private String city;
	private int pincode;
	private int userId;
	
	@OneToOne
    private UserDetail userdetail;
	
	public UserDetail getUserdetail() {
		return userdetail;
	}

	public void setUserdetail(UserDetail userdetail) {
		this.userdetail = userdetail;
	}

	public int getBillingaddressId() {
		return billingaddressId;
	}

	public void setBillingaddressId(int billingaddressId) {
		this.billingaddressId = billingaddressId;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	
	
	

}
