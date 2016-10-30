package com.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.daoimplementation.CategoryDAOImpl;
import com.firststep.model.Category;

@Service
public class CategoryService 
{
	
	@Autowired
	private CategoryDAOImpl categoryDAOImpl;
	
	
	@Transactional
	public List<Category> CategoryList() {
		return this.categoryDAOImpl.CategoryList();
	}
		
	@Transactional
	//addsubCategory
	public void createCategory(Category category) {
	      categoryDAOImpl.createCategory(category);
	}

	@Transactional
	public String stringcategory(){
		return categoryDAOImpl.stringcategory();
	}


    @Transactional
    public Category getIdByName(String categoryName){
    	
    	return  categoryDAOImpl.getIdByName(categoryName);
    }
    
    @Transactional
    public void deleteCategory(int categoryId) {
    	  categoryDAOImpl.deleteCategory(categoryId);
    	 }
    
    @Transactional
    public Category getCatById(int categoryId)  {
    	
    	return categoryDAOImpl.getCatById(categoryId);
    }
}




