package com.firststep.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

import com.google.gson.annotations.Expose;
@SuppressWarnings("serial")
@Entity
public class Product implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Expose
	private int productId;
	@Expose
	private String productName;
	@Expose
	private String productDescription;
	@Expose
	private String productPrice;
	
	@Transient
	private MultipartFile productImage;
	@Expose
	private int subcategoryId;
	@Expose
    private int supplierAddressId;
//	@Expose
//    private int userId;
//    
	@Expose
	private String sku;
	@Expose
	private String shoeType;
	@Expose
	private String brands;
	@Expose
	private String colours;
	@Expose
	private String upperMaterial;
	@Expose
	private String innerMaterial;
	@Expose
	private String soleMaterial;
	@Expose
	private String heelHeight;
	@Expose
	private String quantity;
	@Expose
	private Date orderDate;
	
	
    public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getShoeType() {
		return shoeType;
	}

	public void setShoeType(String shoeType) {
		this.shoeType = shoeType;
	}

	public String getBrands() {
		return brands;
	}

	public void setBrands(String brands) {
		this.brands = brands;
	}

	public String getColours() {
		return colours;
	}

	public void setColours(String colours) {
		this.colours = colours;
	}

	public String getUpperMaterial() {
		return upperMaterial;
	}

	public void setUpperMaterial(String upperMaterial) {
		this.upperMaterial = upperMaterial;
	}

	public String getInnerMaterial() {
		return innerMaterial;
	}

	public void setInnerMaterial(String innerMaterial) {
		this.innerMaterial = innerMaterial;
	}

	public String getSoleMaterial() {
		return soleMaterial;
	}

	public void setSoleMaterial(String soleMaterial) {
		this.soleMaterial = soleMaterial;
	}

	public String getHeelHeight() {
		return heelHeight;
	}

	public void setHeelHeight(String heelHeight) {
		this.heelHeight = heelHeight;
	}

	@ManyToOne
	@JoinColumn(name="subcategoryId" ,nullable=false,insertable=false,updatable=false)
	private Subcategory subcategory;

	@ManyToOne
   	@JoinColumn(name="supplierAddressId" ,nullable=false,insertable=false,updatable=false)
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


	public int getSupplierAddressId() {
		return supplierAddressId;
	}

	public void setSupplierAddressId(int supplierAddressId) {
		this.supplierAddressId = supplierAddressId;
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

	public MultipartFile getProductImage() {
		return productImage;
	}

	public void setProductImage(MultipartFile productImage) {
		this.productImage = productImage;
	}
}

//	public MultipartFile getProductImage() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	

