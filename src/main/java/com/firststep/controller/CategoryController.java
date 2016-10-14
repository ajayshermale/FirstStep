package com.firststep.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.firststep.model.Category;
import com.service.CategoryService;

@Controller
public class CategoryController {

	@Autowired
    private CategoryService categoryService;
	
	
	@RequestMapping(value= "/category/saveOrUpdate", method = RequestMethod.GET)
	public String saveOrUpdate(@ModelAttribute("category") Category category)
	{
		
		this.categoryService.saveOrUpdate(category);
	
		
		return "redirect:/category";
}
	
	
}
