package com.daoimplementation;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dao.CategoryDAO;
import com.firststep.model.Category;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Repository
public class CategoryDAOImpl implements CategoryDAO
{   
	//get session factory
	@Autowired
	private SessionFactory sessionFactory;
	
	public void createCategory(Category category)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(category);
	}

	public void deleteCategory(int categoryId)
	   {
           Category categoryToDelete = new Category();	
           categoryToDelete.setCategoryId(categoryId);
   		   sessionFactory.getCurrentSession().delete(categoryToDelete);
       }
	
	@SuppressWarnings("unchecked")
	public Category getCatById(int categoryId) {
		String sql = "from Category where categoryId=" +categoryId;
		//we need to convert this sql to db specific query... sql is variable name can be any thing
		List<Category> categoryList = sessionFactory.getCurrentSession().createQuery(sql).getResultList();
		if(categoryList!=null && !categoryList.isEmpty())
		{
			return categoryList.get(0);
		}
		else return null;
     	}
	@SuppressWarnings("unchecked")
	public List<Category> CategoryList() 
	{	
		//String sql ="from Category"
	List<Category> CategoryList = this.sessionFactory.getCurrentSession().createQuery("from Category").getResultList();
		return CategoryList;
	}

	@SuppressWarnings("unchecked")
	public String stringcategory()
	{
	    Gson list = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
		List<Category> categoryList = sessionFactory.getCurrentSession().createQuery("from Category").getResultList();
		String categoryjson= list.toJson(categoryList);
		return categoryjson;
	}
	
	@SuppressWarnings("unchecked")
	public Category getIdByName(String categoryName) 
	{
			String sql = "from Category where categoryName= '" +categoryName+"'";
			List<Category> list = sessionFactory.getCurrentSession().createQuery(sql).getResultList();
			if(list!=null && !list.isEmpty())
			{
				return list.get(0);
			}
			else return null;
		}




}


