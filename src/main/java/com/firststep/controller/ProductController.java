package com.firststep.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.firststep.model.Product;
import com.firststep.model.Subcategory;
import com.firststep.model.Supplier;
import com.service.ProductService;
import com.service.SubcategoryService;
import com.service.SupplierService;

@Controller
public class ProductController 
{
	@Autowired
	private ProductService productService;
	
	@Autowired
	private SubcategoryService subcategoryService;
	
	@Autowired
	private SupplierService supplierService;
	
	@RequestMapping("/product")
    public String stringproduct(Model model)
    {
		model.addAttribute("product", new Product());
		model.addAttribute("productjson",this.productService.stringproduct());
	//	model.addAttribute("listproduct",this.productService.listproduct());
		model.addAttribute("listsubCategory",this.subcategoryService.listsubCategory());
		model.addAttribute("SupplierList",this.supplierService.SupplierList());
        return "product";
    }
	
	@RequestMapping(value="/add/product", method=RequestMethod.POST)
	 public String addproduct(Product product)
	{
		Subcategory subcategory = subcategoryService.getsubCatIdByName(product.getSubcategory().getSubcategoryName());
		subcategoryService.createsubCategory(subcategory);
		product.setSubcategory(subcategory);
		product.setSubcategoryId(subcategory.getSubcategoryId());
		
		Supplier supplier = supplierService.getIdByName(product.getSupplier().getSupplierName());
		supplierService.createSupplier(supplier);
		product.setSupplier(supplier);
		product.setSupplierId(supplier.getSupplierId());
		this.productService.addproduct(product);
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
		model.addAttribute("SupplierList",this.supplierService.SupplierList());
		model.addAttribute("product",productService.getProductById(productId));
		return "product";
		
	}
	
	/*@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
	public String uploadFileHandler(@RequestParam("productId") int productId)
	{
		
		Product product=productService.getProductById(productId);
		 
				byte[] bytes = file.getBytes();

				// Creating the directory to store file
				String rootPath = System.getProperty("catalina.home");
				File dir = new File(rootPath + File.separator + "tmpFiles");
				if (!dir.exists())
					dir.mkdirs();

				// Create the file on server
				File serverFile = new File(dir.getAbsolutePath()
						+ File.separator + name);
				BufferedOutputStream stream = new BufferedOutputStream(
						new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.close();
			
			}	*/
}

