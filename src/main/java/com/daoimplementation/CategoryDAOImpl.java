package com.daoimplementation;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dao.CategoryDAO;
import com.firststep.model.Category;
import com.google.gson.Gson;

@Repository
public class CategoryDAOImpl implements CategoryDAO
{
	@Autowired
	private SessionFactory sessionFactory;
	
	public void createCategory(Category category)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(category);
	}
	
	@SuppressWarnings("unchecked")
	public List<Category> CategoryList() 
	{	
	List<Category> CategoryList = this.sessionFactory.getCurrentSession().createQuery("from Category").getResultList();
		return CategoryList;
	}

	@SuppressWarnings("unchecked")
	public String stringcategory()
	{
	    Gson list = new Gson();
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


	public void deleteCategory(int categoryId)
	   {
           Category categoryToDelete = new Category();	
           categoryToDelete.setCategoryId(categoryId);
   		   sessionFactory.getCurrentSession().delete(categoryToDelete);
           
		 }
	@SuppressWarnings("unchecked")
	public Category getCatById(int categoryId) {
		String sql = "from Category where categoryId=" +categoryId;
		List<Category> categoryList = sessionFactory.getCurrentSession().createQuery(sql).getResultList();
		if(categoryList!=null && !categoryList.isEmpty())
		{
			return categoryList.get(0);
		}
		else return null;
     	}

}


