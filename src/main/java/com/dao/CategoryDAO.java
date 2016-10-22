package com.dao;

import java.util.List;

import com.firststep.model.Category;

public interface CategoryDAO {
	
   public List<Category> CategoryList();
   public void createCategory(Category category);
 /*  public String stringcategory();*/

}
