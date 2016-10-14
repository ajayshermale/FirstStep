package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.CategoryDAO;
import com.daoimplementation.CategoryDAOImpl;
import com.firststep.model.Category;

@Service
public class CategoryService  implements CategoryDAO
{
	@Autowired
	private CategoryDAOImpl categoryDAOImpl;
	@Transactional
	public void saveOrUpdate(Category category) {
		categoryDAOImpl.saveOrUpdate(category);
	}
}
