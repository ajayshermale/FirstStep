package com.firststep.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

import com.google.gson.annotations.Expose;
@Entity
public class ProductFullView {
    
	@Id
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
    private int supplierAddressId;
	@Expose
    private String supplierCompanyName;
    
	
	@Expose
	private int categoryId;
	@Expose
	private  String categoryName;
	
	@Expose
	private int subcategoryId;
	@Expose
    private  String subcategoryName;
	
	
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
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	public MultipartFile getProductImage() {
		return productImage;
	}
	public void setProductImage(MultipartFile productImage) {
		this.productImage = productImage;
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
	public int getSupplierAddressId() {
		return supplierAddressId;
	}
	public void setSupplierAddressId(int supplierAddressId) {
		this.supplierAddressId = supplierAddressId;
	}
	public String getSupplierCompanyName() {
		return supplierCompanyName;
	}
	public void setSupplierCompanyName(String supplierCompanyName) {
		this.supplierCompanyName = supplierCompanyName;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public int getSubcategoryId() {
		return subcategoryId;
	}
	public void setSubcategoryId(int subcategoryId) {
		this.subcategoryId = subcategoryId;
	}
	public String getSubcategoryName() {
		return subcategoryName;
	}
	public void setSubcategoryName(String subcategoryName) {
		this.subcategoryName = subcategoryName;
	}
	
	
	
    
}
