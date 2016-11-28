package com.firststep.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.firststep.model.Category;
import com.service.CategoryService;

@Controller
public class CategoryController {

	@Autowired
    private CategoryService categoryService;
	

	@RequestMapping("/categories")
	public String listPersons(Model model) {
		
		model.addAttribute("category", new Category());
		//create object of json to display list
		model.addAttribute("categoryjson",this.categoryService.stringcategory());
		//object created of jstl to display list
		//model.addAttribute("listCategories", this.categoryService.CategoryList());
		return "categories";
}
	@RequestMapping(value="/add/categories",method=RequestMethod.POST)
	//
	public String addCategory(@ModelAttribute("category") Category category){
		this.categoryService.createCategory(category);
		return "redirect:/categories";
}
	
	@RequestMapping(value="/deleteCategory-{categoryId}",method=RequestMethod.GET)
	public String deleteCategory(@PathVariable ("categoryId")int categoryId){
		this.categoryService.deleteCategory(categoryId);
		return "redirect:/categories";
	}
 
	@RequestMapping(value="/editCategory-{categoryId}")
	public String getCatById(@PathVariable ("categoryId")int categoryId,Model model){
		model.addAttribute("category",this.categoryService.getCatById(categoryId));
		model.addAttribute("categoryjson",this.categoryService.stringcategory());
		return "categories";
	}		
}
