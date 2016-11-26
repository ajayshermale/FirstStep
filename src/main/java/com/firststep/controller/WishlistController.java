package com.firststep.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.firststep.model.Wishlist;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.service.ProductService;
import com.service.UserService;
import com.service.WishlistService;

@Controller
public class WishlistController 
{
	@Autowired
	private UserService userService;

	@Autowired
	private ProductService productService;
	
	@Autowired
	private WishlistService wishlistService;
	
	@RequestMapping("/wishlist-{productId}")
	public String addToBuyNow(@ModelAttribute("wishlist") Wishlist wishlist, @PathVariable("productId") int productId,@RequestParam("userId")int userId,HttpSession session)
	{
	
		 Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	      String username = auth.getName(); //get logged in username
		
	     userId=userService.getUserName(username).getUserId();
	     wishlist.setUserId(userId);
	     wishlist.setCartId(userId);

	     wishlist.setFlag(false);
	     
	     wishlist.setProductId(productId);

	      String pName=productService.getProductById(productId).getProductName();
	      wishlist.setProductName(pName);
	      
	      wishlist.setAmount( productService.getProductById(productId).getProductPrice());
	      wishlist.setRate(productService.getProductById(productId).getProductPrice());
	      
	      wishlist.setQuantity("1");
//	      Date date=new Date();
//	      wishlist.setOrderDate(date);
	      
	      this.wishlistService.SaveOrUpdate(wishlist);
	      
//	      session.setAttribute("wishlistId",wishlist.getWishlistId());
//	      int wishlistId=(Integer) session.getAttribute("wishlistId");      
      
//		  return "redirect:/wishlist-"+wishlistId;
		return "redirect:/";
	}   
	@RequestMapping("/wishlist")
	public  ModelAndView stringWishlist(@ModelAttribute("wishlist") Wishlist wishlist, HttpSession session)
    {
		 
		 Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	      String username = auth.getName(); //get logged in username
		
	    int userId=userService.getUserName(username).getUserId();
	    List<Wishlist> newwishlist=wishlistService.getUserById(userId);
		   Gson list = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
	       String wishlistjson= list.toJson(newwishlist);
		
		   ModelAndView model = new ModelAndView("wishlist");
		   model.addObject("wishlistlist",wishlistjson);
		   return model;
    }
	@RequestMapping(value="/deleteWishlist-{wishlistId}",method=RequestMethod.GET)
	public String deleteWishlist(@PathVariable ("wishlistId")int wishlistId){
		this.wishlistService.deleteWishlist(wishlistId);
		return "redirect:/wishlist";
	}
}

