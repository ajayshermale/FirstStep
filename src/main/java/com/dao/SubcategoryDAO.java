package com.dao;

import java.util.List;

import com.firststep.model.Subcategory;

public interface SubcategoryDAO {

	public void createsubCategory(Subcategory subcategory);  
	public List<Subcategory> listsubCategory();
	public String stringsubcategory();
	public Subcategory getsubCatIdByName(String subcategoryName);
	public void deleteSubCategory(int subcategoryId);
	public Subcategory getSubCatById(int subcategoryId);
}
