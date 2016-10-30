package com.firststep.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity

public class Category {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int categoryId;
	private String categoryName;
	private String categoryDescription;

	@OneToMany
    private Set<Subcategory> subcategory ;

	@OneToMany
    private Set<Product> product ;
	
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
