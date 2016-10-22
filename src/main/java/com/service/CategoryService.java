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
	private CategoryDAOImpl categoryDAO;
	
	
	@Transactional
	public List<Category> CategoryList() {
		return this.categoryDAO.CategoryList();
	}
		
	
	
	@Transactional
	public void createCategory(Category category) {
		categoryDAO.createCategory(category);
	}
}
