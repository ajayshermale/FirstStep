package com.firststep.controller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.firststep.model.CartItem;
import com.firststep.model.Product;
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
	public String addToBuyNow(@ModelAttribute("cartItem") CartItem cartItem, @PathVariable("productId") int productId,@RequestParam("userId")int userId,HttpSession session)
	{
	
		 Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	      String username = auth.getName(); //get logged in username
		
	     userId=userService.getUserName(username).getUserId();
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
	      
	      session.setAttribute("cartItemId",cartItem.getCartItemId());
	      int cartItemId=(Integer) session.getAttribute("cartItemId");      
//	      
		  return "redirect:/cartItem-"+cartItemId;
		
	}   

	@RequestMapping("/cartItem-{cartItemId}")
	public  ModelAndView stringCartItem(@ModelAttribute("cartItem") CartItem cartItem,@PathVariable("cartItemId") int cartItemId,HttpSession session)
    {
		 
	       cartItemId=(Integer) session.getAttribute("cartItemId"); 
	       session.setAttribute("cartItemId",cartItem.getCartItemId());
		   
		   CartItem newcartItem=CartItemService.getCartItemId(cartItemId);
		
		   Gson list = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
	       String cartItemjson= list.toJson(newcartItem);
		
		   ModelAndView model = new ModelAndView("cartItem");
		   model.addObject("cartItemlist",cartItemjson);
		   return model;
    }
	
	@RequestMapping("/checkout-{productId}")
	public String checkout(@ModelAttribute("cartItem") CartItem cartItem,@PathVariable("productId") int productId, HttpSession session,Product product){
	
		 Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	     String username = auth.getName(); 
		
	    int userId=userService.getUserName(username).getUserId();
	     session.setAttribute("userId", userId);
	     
	     session.setAttribute("productId",productId);
	     productId=(Integer) session.getAttribute("productId");
	     
		
	    return "redirect:/check?userId="+userId;
	}
	
	
	
	
}
