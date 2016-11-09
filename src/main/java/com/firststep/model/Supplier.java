package com.firststep.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.google.gson.annotations.Expose;

@SuppressWarnings("serial")
@Entity
public class Supplier  implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Expose
	private int supplierAddressId;
	//private int supplierId;
	@Expose
	private String supplierCompanyAddress;
	@Expose
	private String supplierCompanyName;
	@Expose
	private String supplierURL;
	@Expose
	private String supplierCity;
	@Expose
	private String supplierState;
	@Expose
	private String supplierPincode;
	

	@ManyToOne
	public UserDetail userdetail;


	public int getSupplierAddressId() {
		return supplierAddressId;
	}


	public void setSupplierAddressId(int supplierAddressId) {
		this.supplierAddressId = supplierAddressId;
	}


	public String getSupplierCompanyAddress() {
		return supplierCompanyAddress;
	}


	public void setSupplierCompanyAddress(String supplierCompanyAddress) {
		this.supplierCompanyAddress = supplierCompanyAddress;
	}


	public String getSupplierCompanyName() {
		return supplierCompanyName;
	}


	public void setSupplierCompanyName(String supplierCompanyName) {
		this.supplierCompanyName = supplierCompanyName;
	}


	public String getSupplierURL() {
		return supplierURL;
	}


	public void setSupplierURL(String supplierURL) {
		this.supplierURL = supplierURL;
	}


	public String getSupplierCity() {
		return supplierCity;
	}


	public void setSupplierCity(String supplierCity) {
		this.supplierCity = supplierCity;
	}


	public String getSupplierState() {
		return supplierState;
	}


	public void setSupplierState(String supplierState) {
		this.supplierState = supplierState;
	}


	public String getSupplierPincode() {
		return supplierPincode;
	}


	public void setSupplierPincode(String supplierPincode) {
		this.supplierPincode = supplierPincode;
	}


	public UserDetail getUserdetail() {
		return userdetail;
	}


	public void setUserdetail(UserDetail userdetail) {
		this.userdetail = userdetail;
	}


		
}
