package com.firststep.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.firststep.model.Category;
import com.firststep.model.Product;
import com.service.CategoryService;
import com.service.ProductService;
import com.service.SubcategoryService;

@Controller
public class FirstStep {
	
	@Autowired
	CategoryService categoryService;
	
	@Autowired
	private SubcategoryService subcategoryService;
	
	@Autowired
	private ProductService productService;
	
		@RequestMapping("/")
		public String getHome(Model model)
		{  
			model.addAttribute("category",new Category());
			model.addAttribute("listCategories", this.categoryService.CategoryList());
			model.addAttribute("listsubCategory",this.subcategoryService.listsubCategory());
			
			
			model.addAttribute("listproduct",this.productService.listproduct());
			return "index";
		}
	
		@RequestMapping("/403")
		public String errorHandler()
		{
			return "403";
			
		}
		
		
}
