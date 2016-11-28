package com.daoimplementation;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dao.SubcategoryDAO;
import com.firststep.model.Subcategory;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Repository
public class SubcategoryDAOImpl implements SubcategoryDAO
{
	@Autowired
	private SessionFactory sessionFactory;

	public void createsubCategory(Subcategory subcategory) {
		
		sessionFactory.getCurrentSession().saveOrUpdate(subcategory);
	}

	@SuppressWarnings("unchecked")
	public List<Subcategory> listsubCategory() {
		List<Subcategory> subcategorylist = sessionFactory.getCurrentSession().createQuery("from Subcategory").getResultList();
		return subcategorylist;
	}
     
	@SuppressWarnings("unchecked")
	public String stringsubcategory() {
		Gson list = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
		List<Subcategory> subcategoryList = sessionFactory.getCurrentSession().createQuery("from Subcategory").getResultList();
		String subcategoryjson= list.toJson(subcategoryList);
		return subcategoryjson;
	}

	@SuppressWarnings("unchecked")
	public Subcategory getsubCatIdByName(String subcategoryName) {
		String sql = "from Subcategory where subcategoryName= '" +subcategoryName+"'";
		List<Subcategory> list = sessionFactory.getCurrentSession().createQuery(sql).getResultList();
		if(list!=null && !list.isEmpty())
		{
			return list.get(0);
		}
		else return null;
	}

	public void deleteSubCategory(int subcategoryId) 
	{
		Subcategory subcategoryToDelete=new Subcategory();
		subcategoryToDelete.setSubcategoryId(subcategoryId);
		sessionFactory.getCurrentSession().delete(subcategoryToDelete);
			
	}
   //edit	
	@SuppressWarnings("unchecked")
	public Subcategory getSubCatById(int subcategoryId) 
	{
		String sql = "from Subcategory where subcategoryId=" +subcategoryId;
		List<Subcategory> list = sessionFactory.getCurrentSession().createQuery(sql).getResultList();
		if(list!=null && !list.isEmpty())
		{
			return list.get(0);
		}
		else return null;
		
	}

	

}
