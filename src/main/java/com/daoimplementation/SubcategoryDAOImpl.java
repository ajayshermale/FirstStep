package com.daoimplementation;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dao.SubcategoryDAO;
import com.firststep.model.Subcategory;

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
		List<Subcategory> subcategorylist = sessionFactory.getCurrentSession().createQuery("from subcategory").getResultList();
		return subcategorylist;
	}
     
	@SuppressWarnings("unchecked")
	public String stringsubcategory() {
		Gson list = new Gson();
		List<Subcategory> subcategoryList = sessionFactory.getCurrentSession().createQuery("from Subcategory").getResultList();
		String subcategoryjson= list.toJson(subcategoryList);
		return subcategoryjson;;
	}

	@SuppressWarnings("unchecked")
	public Subcategory getsubCatIdByName(String subcategoryName) {
		String sql = "from Subcategory where subCategoryName= '" +subcategoryName+"'";
		List<Subcategory> list = sessionFactory.getCurrentSession().createQuery(sql).getResultList();
		if(list!=null && !list.isEmpty())
		{
			return list.get(0);
		}
		else return null;
	}

	public void deleteSubCategory(int subCategoryId) 
	{
		Subcategory subcategoryToDelete=new Subcategory();
		subcategoryToDelete.setCategoryId(subCategoryId);
		sessionFactory.getCurrentSession().delete(subcategoryToDelete);
			
	}
	
	@SuppressWarnings("unchecked")
	public Subcategory getSubCatById(int subCategoryId) 
	{
		String sql = "from Subcategory where subCategoryId=" +subCategoryId;
		List<Subcategory> list = sessionFactory.getCurrentSession().createQuery(sql).getResultList();
		if(list!=null && !list.isEmpty())
		{
			return list.get(0);
		}
		else return null;
		
	}

}
