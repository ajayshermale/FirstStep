package com.firststep.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.google.gson.annotations.Expose;
@SuppressWarnings("serial")
@Entity
public class Subcategory implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Expose
	private int subcategoryId;
	@Expose
	private String subcategoryName;
	@Expose
	private String subcategoryDescription;
	@Expose
	private int categoryId;
	
	@ManyToOne
	@JoinColumn(name="categoryId" ,nullable=false,insertable=false,updatable=false)
	private Category category;
	
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

	public String getSubcategoryDescription() {
		return subcategoryDescription;
	}

	public void setSubcategoryDescription(String subcategoryDescription) {
		this.subcategoryDescription = subcategoryDescription;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
