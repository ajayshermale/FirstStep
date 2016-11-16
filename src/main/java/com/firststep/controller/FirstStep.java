package com.firststep.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.firststep.model.Category;
import com.firststep.model.Product;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.service.CategoryService;
import com.service.ProductFullViewService;
import com.service.ProductService;
import com.service.SubcategoryService;

@Controller
public class FirstStep {
	
	@Autowired
	CategoryService categoryService;
	
	@Autowired
	private SubcategoryService subcategoryService;
	
	@Autowired
	private ProductFullViewService productFullViewService;
	
		@RequestMapping("/")
		public String getHome(Model model)
		{  
			model.addAttribute("category",new Category());
			model.addAttribute("listCategories", this.categoryService.CategoryList());
			model.addAttribute("listsubCategory",this.subcategoryService.listsubCategory());
			
			model.addAttribute("productjson",this.productFullViewService.stringproductFullView());  
			return "index";
		}
	
		

		
		@RequestMapping("/productlist")
		public String errorHandler(Model model)
		{
			model.addAttribute("productjson",this.productFullViewService.stringproductFullView());
			return "productlist";
			
		}
		
		
}
