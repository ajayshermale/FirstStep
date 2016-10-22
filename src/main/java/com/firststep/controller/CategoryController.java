package com.firststep.controller;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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
		model.addAttribute("categories", new Category());
		model.addAttribute("listCategories", this.categoryService.CategoryList());
		return "categories";
}
	@RequestMapping("/add/categories")
	public String addCategory(@ModelAttribute("categories") Category category){
		this.categoryService.createCategory(category);
		return "redirect:/categories";
	
}
}
