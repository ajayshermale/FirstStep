package com.firststep.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.firststep.model.Product;
import com.firststep.model.ProductFullView;
import com.firststep.model.Subcategory;
import com.firststep.model.Supplier;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.service.ProductFullViewService;
import com.service.ProductService;
import com.service.SubcategoryService;
//import com.service.SupplierService;
import com.service.UserService;

@Controller
public class ProductController 
{
	@Autowired
	private ProductService productService;
	
	@Autowired
	private SubcategoryService subcategoryService;
     
	@Autowired
    private UserService userService;
	
	@Autowired
	private ProductFullViewService productFullViewService;

	
	@RequestMapping("/product")
    public String stringproduct(Model model)
    {
		model.addAttribute("product", new Product());
		model.addAttribute("productjson",this.productService.stringproduct());
	//	model.addAttribute("listproduct",this.productService.listproduct());
		model.addAttribute("listsubCategory",this.subcategoryService.listsubCategory());
		model.addAttribute("SupplierList",this.userService.SupplierList());
        return "product";
    }
	
	@RequestMapping(value="/addproduct", method=RequestMethod.POST)
	 public String addproduct(@ModelAttribute("product") Product product)
	{
		Subcategory subcategory = subcategoryService.getsubCatIdByName(product.getSubcategory().getSubcategoryName());
		subcategoryService.createsubCategory(subcategory);
		product.setSubcategory(subcategory);
		product.setSubcategoryId(subcategory.getSubcategoryId());
		
		 Date date=new Date();
		 product.setOrderDate(date);
		
		
		Supplier supplier = userService.getIdByName(product.getSupplier().getSupplierCompanyName())	;
		userService.SaveOrUpdateSupplier(supplier);
		product.setSupplier(supplier);
		product.setSupplierAddressId(supplier.getSupplierAddressId());
		this.productService.addproduct(product);
		
	
		String path="C:\\Users\\Rahul\\workspacerefresh\\FirstStep\\src\\main\\webapp\\resources\\images\\";
		path=path+String.valueOf(product.getProductId())+".jpg";
		File f=new File(path);
		System.out.println("path is"+path);
		MultipartFile filedet=product.getProductImage();
		
		if(!filedet.isEmpty())
		{
			try
			{
			  byte[] bytes=filedet.getBytes();
			  FileOutputStream fos=new FileOutputStream(f);
              			BufferedOutputStream bs=new BufferedOutputStream(fos);
              			bs.write(bytes);
              			bs.close();
             			 System.out.println("File Uploaded Successfully");
			}
			catch(Exception e)
			{
				System.out.println("Exception Arised"+e);
			}
		}
		else
		{
			System.out.println("File is Empty");
		}
			return "redirect:/product";
			}

	
	@RequestMapping(value="/deleteproduct-{productId}", method = RequestMethod.GET)
	public String deleteProduct(@PathVariable ("productId")int productId) 
	{
		this.productService.deleteProduct(productId);
		return "redirect:/product";
	}
	
	@RequestMapping(value= "/editproduct-{productId}" )
	public String editProduct(@PathVariable("productId") int productId, Model model)
	{
		model.addAttribute("listsubCategory",this.subcategoryService.listsubCategory());
		model.addAttribute("SupplierList",this.userService.SupplierList());
		model.addAttribute("product",productService.getProductById(productId));
     	model.addAttribute("productjson",this.productService.stringproduct());
		return "product";
		
	}
	
//	@RequestMapping(value= "/viewproduct-{productId}-product" )
//	public ModelAndView viewProduct(@PathVariable("productId") int productId,Product product)
//	{
//		 product =productService.getProductById(productId);
//		 Gson g = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
//		 String productjson= g.toJson(product);
//		 
//		 ModelAndView model = new ModelAndView("viewproduct");
//		model.addObject("productview",productjson);
//		 
//		return model;
//	}
	
	
	@RequestMapping(value= "/viewproduct-{productId}-product" )
	public ModelAndView viewProduct(@PathVariable("productId") int productId,ProductFullView product)
	{
		 product =productFullViewService.getProductFullViewById(productId);
		 Gson g = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
		 String productjson= g.toJson(product);
		 
		 ModelAndView model = new ModelAndView("viewproduct");
		 model.addObject("productview",productjson);
		
		 
		return model;
	}
	
	@RequestMapping(value="/productlist")
	public String displayProducts(Model model)
	{
		model.addAttribute("productjson",this.productFullViewService.stringproductFullView());
		return "productlist";
		
	}
	
	@RequestMapping(value="/403")
	public String displayProduct(Model model)
	{
		model.addAttribute("productjson",this.productFullViewService.stringproductFullView());
		return "403";
		
	}
	
	
	
	
	
//	@RequestMapping(value= "/supplier-{supplierAddressId}-supplier" )
//	public ModelAndView viewSupplier(@PathVariable("supplierAddressId") int supplierAddressId,Supplier supplier)
//	{
//		supplier=userService.getSupplierById(supplierAddressId);
////		model.addAttribute("product",userService.getSupplierById(supplierAddressId));
//		Gson list = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
//		String supjson= list.toJson(supplier);
//		
//		 ModelAndView model = new ModelAndView("supplier");
//		 model.addObject("supplier",supjson);
//		return model;
//	}
	
	@RequestMapping(value= "/supplier-{supplierAddressId}-supplier" )
	public String viewSupplier(@PathVariable("supplierAddressId") int supplierAddressId, Model model,Supplier supplier)
	{
		
		model.addAttribute("supplier",userService.getSupplierById(supplierAddressId));
//		model.addAttribute("supjson",this.userService.stringsupplier());
		return "supplier";
	}
}

