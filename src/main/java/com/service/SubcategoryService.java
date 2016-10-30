package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.daoimplementation.SubcategoryDAOImpl;
import com.firststep.model.Subcategory;

@Service
public class SubcategoryService {
	
	@Autowired
	   private SubcategoryDAOImpl subcategoryDaoImpl;
	@Transactional
	
	public void createsubCategory(Subcategory subcategory)
	{
		subcategoryDaoImpl.createsubCategory(subcategory);
	}
	@Transactional
	public List<Subcategory> listsubCategory() 
	{
	return subcategoryDaoImpl.listsubCategory();
	}

	@Transactional
	public Subcategory getsubCatIdByName(String subcategoryName)
	{
		return subcategoryDaoImpl.getsubCatIdByName(subcategoryName);
	}

	@Transactional
	public String stringsubCategory()
	{
		return subcategoryDaoImpl.stringsubcategory();
	}
	
   @Transactional
	public void deleteSubCategory(int subcategoryId)
	{
		subcategoryDaoImpl.deleteSubCategory(subcategoryId);
	}
   @Transactional
	public Subcategory getSubCatById(int subcategoryId)
	{
		return subcategoryDaoImpl.getSubCatById(subcategoryId);
	}
	
}
