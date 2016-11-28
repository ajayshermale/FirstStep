package com.firststep.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.google.gson.annotations.Expose;

@Entity
@SuppressWarnings("serial")
public class Category implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Expose
	private int categoryId;
	@Expose
	private String categoryName;
	@Expose
	private String categoryDescription;
	

	@OneToMany(fetch = FetchType.EAGER,cascade=CascadeType.ALL,mappedBy="category")
    private Set<Subcategory> subcategory ;

//	@OneToMany
//    private Set<Product> product ;
//	
//	public Set<Product> getProduct() {
//		return product;
//	}
//	public void setProduct(Set<Product> product) {
//		this.product = product;
//	}
	public Set<Subcategory> getSubcategory() {
		return subcategory;
	}
	public void setSubcategory(Set<Subcategory> subcategory) {
		this.subcategory = subcategory;
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
	public String getCategoryDescription() {
		return categoryDescription;
	}
	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}
	
	
}
