package com.firststep.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.firststep.model.BillingAddress;
import com.firststep.model.ShippingAddress;
import com.firststep.model.UserDetail;
import com.service.UserService;



@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/register")
	public String register(Model model)
	{    
		
		UserDetail userdetail=new UserDetail();
		BillingAddress billingAddress= new  BillingAddress();
		ShippingAddress shippingAddress= new ShippingAddress();
		
		
		userdetail.setBillingAddress(billingAddress);
		userdetail.setShippingAddress(shippingAddress);
		model.addAttribute("userdetail", new UserDetail());
		return "redirect:/reg";
		
	}

	@RequestMapping(value="/add/register",method=RequestMethod.POST)
	//
	public String addUserDetail(@ModelAttribute("userdetail") UserDetail userdetail)
	{
		this.userService.saveOrupdate(userdetail);
		return "redirect:/register";
	}
	
	@RequestMapping("/newsupplier")
	public String newsupplier(Model model)
	{    
		
		UserDetail userdetail=new UserDetail();
	   BillingAddress billingAddress= new  BillingAddress();
	   ShippingAddress shippingAddress= new ShippingAddress();
		
		
		userdetail.setBillingAddress(billingAddress);
	    userdetail.setShippingAddress(shippingAddress);
		model.addAttribute("supplier", new UserDetail());
		return "redirect:/sup";
		
	}
	
	@RequestMapping(value="/add/newsupplier",method=RequestMethod.POST)
	//
	public String addSupplierDetail(@ModelAttribute("supplier") UserDetail userdetail)
	{
		this.userService.createSupplier(userdetail);
		return "redirect:/newsupplier";
	}
	
	@RequestMapping("/login")
	public String login(){
		return "login";
	}
	
	
	@RequestMapping(value="/perform_logout", method = RequestMethod.GET)
	public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
	    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    if (auth != null){    
	        new SecurityContextLogoutHandler().logout(request, response, auth);
	    }
	    return "redirect:/";
	}

	
//	@RequestMapping("/registeradmin")
//	public String registerAdmin(Model model)
//	{    
//		UserDetail userdetail=new UserDetail();
//		
//		model.addAttribute("admin", new UserDetail());
//	     return"/registeradmin";
//	}	
		

//	@RequestMapping(value="/addregisteradmin",method=RequestMethod.POST)
//	//
//	public String addRegisterAdmin(@ModelAttribute("admin") UserDetail userdetail)
//	{
//
//		this.userService.createAdmin(userdetail);
//		return "redirect:/";
//     }
//	
	
}