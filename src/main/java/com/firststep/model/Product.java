package com.firststep.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int productId;
	private String productName;
	private String productDescription;
	private String productPrice;
	
	private int subcategoryId;
    private int supplierId;
    
    @ManyToOne
	@JoinColumn(name="subcategoryId" ,nullable=false,insertable=false,updatable=false)
	private Subcategory subcategory;

	@ManyToOne
   	@JoinColumn(name="supplierId" ,nullable=false,insertable=false,updatable=false)
   	private Supplier supplier;

	 
    public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
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

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public int getSubcategoryId() {
		return subcategoryId;
	}

	public void setSubcategoryId(int subcategoryId) {
		this.subcategoryId = subcategoryId;
	}

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	public Subcategory getSubcategory() {
		return subcategory;
	}

	public void setSubcategory(Subcategory subcategory) {
		this.subcategory = subcategory;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
    
}
