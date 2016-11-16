package com.firststep.controller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.firststep.model.CartItem;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.service.CartItemService;
import com.service.ProductService;
import com.service.UserService;


@Controller
public class CartItemController
{
	@Autowired
	private UserService userService;

	@Autowired
	private ProductService productService;
	
	@Autowired
	private CartItemService CartItemService;
	
	@RequestMapping("/buynow-{productId}")
	public String addToBuyNow(@ModelAttribute("cartItem") CartItem cartItem, @PathVariable("productId") int productId,@RequestParam("userId")int userId,int cartItemId,HttpSession session)
	{
	
		 Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	      String userName = auth.getName(); //get logged in username
		
	     userId=userService.getUserId(userName).getUserId();
	     cartItem.setUserId(userId);
	     cartItem.setCartId(userId);

	      cartItem.setFlag(false);
	     
	      cartItem.setProductId(productId);

	      String pName=productService.getProductById(productId).getProductName();
	      cartItem.setProductName(pName);
	      
	      cartItem.setAmount( productService.getProductById(productId).getProductPrice());
	      cartItem.setRate(productService.getProductById(productId).getProductPrice());
	      
	      cartItem.setQuantity("1");
	      Date date=new Date();
	      cartItem.setOrderDate(date);
	      
	      this.CartItemService.SaveOrUpdate(cartItem);
	     
//	      session.setAttribute("cartItemId",cartItem.getCartItemId());
//	      cartItemId=(Integer) session.getAttribute("cartItemId");
	      
		  return "redirect:/cartlist"+cartItem.getCartItemId();
		
	}

	@RequestMapping("/cartlist-{cartItemId}")
	public  ModelAndView stringCartItem(@PathVariable("cartItemId")int cartItemId)
    {
		
		
		CartItem cartItem=CartItemService.getCartItemId(cartItemId);
		
		Gson list = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
		String cartItemjson= list.toJson(cartItem);
		
		 ModelAndView model = new ModelAndView("cartItem");
		 model.addObject("cartItem",cartItemjson);
		return model;
		
		
    }
	
}
