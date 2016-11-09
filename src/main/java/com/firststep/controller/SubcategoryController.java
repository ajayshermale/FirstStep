package com.firststep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.firststep.model.Category;
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
	public String addsubCategory(@ModelAttribute("subCategory") Subcategory subcategory)
	{
        //to find id using name given by user
		Category category = categoryService.getIdByName(subcategory.getCategory().getCategoryName());
		categoryService.createCategory(category);
		subcategory.setCategory(category);
		subcategory.setCategoryId(category.getCategoryId());
		this.subcategoryService.createsubCategory(subcategory);
		return "redirect:/subCategory";
	}
	
	@RequestMapping(value="/deletesubCategory-{subcategoryId}", method = RequestMethod.GET)
	public String deleteSubCategory(@PathVariable ("subcategoryId")int subcategoryId)
	{
		this.subcategoryService.deleteSubCategory(subcategoryId);
		return "redirect:/subCategory";
	}
	@RequestMapping(value= "/editsubCategory-{subcategoryId}" )
	public String editSubCategory(@PathVariable("subcategoryId") int subcategoryId, Model model)
	{
		model.addAttribute("listCategory",this.categoryService.CategoryList());
		model.addAttribute("subCategory",subcategoryService.getSubCatById(subcategoryId));
		model.addAttribute("subCategoryjson",this.subcategoryService.stringsubCategory());
		return "subCategory";
	}

	
}
