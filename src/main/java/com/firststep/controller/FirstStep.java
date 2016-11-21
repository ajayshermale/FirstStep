package com.firststep.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.firststep.model.Category;
import com.firststep.model.Product;
import com.firststep.model.UserDetail;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.service.CategoryService;
import com.service.ProductFullViewService;
import com.service.ProductService;
import com.service.SubcategoryService;
import com.service.UserService;

@Controller
public class FirstStep {
	
	@Autowired
	CategoryService categoryService;
	
	@Autowired
	private SubcategoryService subcategoryService;
	
	@Autowired
	private ProductFullViewService productFullViewService;
	
	@Autowired
	private UserService userService;
	
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
		public String displayProducts(Model model)
		{
			model.addAttribute("productjson",this.productFullViewService.stringproductFullView());
			return "productlist";
			
		}
		
		@RequestMapping("/profile")
		public String displayProfile(String username,Model model)
		{
			model.addAttribute("userDetail",this.userService.getUserName(username));
		
			return "profile";	
		}
        
		@RequestMapping(value="/editUserDetail-{username}")
		public String getCatById(@PathVariable ("username")String username,Model model)
		{
			model.addAttribute("userDetail",this.userService.getUserName(username));
			return "registration";
		}		
        
		@RequestMapping(value="/shippingaddress-{userId}")
		public String getShippingAddress(@PathVariable ("userId")Model model,int userId)
		{
			model.addAttribute("shippingAddress",this.userService.getShippingAddress(userId));
			return "shippingaddress";
		}
		
		@RequestMapping(value="/billingaddress-{userId}")
		public String getBillingAddress(@PathVariable ("userId")Model model,int userId)
		{
			model.addAttribute("billingAddress",this.userService.getBillingAddress(userId));
			return "billingaddress";
		}
		
		@RequestMapping("/aboutous")
		public String getAboutOus()
		{ 
			return "aboutous";
		}
		
		@RequestMapping("/contactous")
		public String getContactOus()
		{ 
			return "contactous";
		}
}
