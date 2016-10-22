package com.daoimplementation;

import java.util.List;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dao.CategoryDAO;
import com.firststep.model.Category;

@Repository
public class CategoryDAOImpl implements CategoryDAO
{
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@SuppressWarnings("unchecked")
	public List<Category> CategoryList() {
		
			List<Category> CategoryList = this.sessionFactory.getCurrentSession().createQuery("from Category").getResultList();
		
			
		return CategoryList;
	}

	public void createCategory(Category category) {
		sessionFactory.getCurrentSession().saveOrUpdate(category);
		
	}

	/*public String stringcategory()
	{
	Gson list=new Gson();
		return null;
	}*/
	}


