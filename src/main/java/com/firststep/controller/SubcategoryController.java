package com.firststep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.firststep.model.Subcategory;
import com.service.CategoryService;
import com.service.SubcategoryService;

@Controller
public class SubcategoryController {


	@Autowired
	private SubcategoryService subcategoryService;
	
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping("/subCategory")
	public String subCategory(Model model) 
	{
		
		model.addAttribute("subCategory", new Subcategory());
		model.addAttribute("subCategoryjson",this.subcategoryService.stringsubCategory());
		model.addAttribute("listsubCategory",this.subcategoryService.listsubCategory());
		model.addAttribute("listCategory",this.categoryService.CategoryList());
		return "subCategory";
	}
	
	@RequestMapping(value="/add/subCategory", method=RequestMethod.POST)
	public String addsubCategory(@ModelAttribute("subcategory") Subcategory subcategory)
	{

		Category category = categoryService.getIdByName(subcategory.getCategory().getCategoryName());
		categoryService.addCategory(category);
		subcategory.setCategory(category);
		subcategory.setCategory_id(category.getCategory_id());
		this.subcategoryService.addsubCategory(subcategory);
		return "redirect:/subCategory";
	}
}
