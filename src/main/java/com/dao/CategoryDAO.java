package com.dao;

import java.util.List;

import com.firststep.model.Category;


public interface CategoryDAO {
	
   public List<Category> CategoryList();
   public void createCategory(Category category);
   public String stringcategory();
   public Category getIdByName(String categoryName);
   public void deleteCategory(int categoryId);
   public Category getCatById(int categoryId);
   
}
