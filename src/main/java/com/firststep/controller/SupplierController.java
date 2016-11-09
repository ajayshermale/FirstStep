/*
package com.firststep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.firststep.model.Supplier;
import com.service.SupplierService;

@Controller
public class SupplierController {

	@Autowired
private SupplierService supplierService;
	

	@RequestMapping("/supplier")
	public String listSupplier(Model model) 
	{
		model.addAttribute("supplier", new Supplier());
		model.addAttribute("listSuppliers", this.supplierService.SupplierList());
		model.addAttribute("supplierjson",this.supplierService.stringsupplier());
		return "supplier";
}
	@RequestMapping("/add/supplier")
	public String addSupplier(@ModelAttribute("supplier") Supplier supplier){
		this.supplierService.createSupplier(supplier);
		return "redirect:/supplier";
}

	@RequestMapping(value="/deleteSupplier-{supplierId}",method=RequestMethod.GET)
	public String deleteSupplier(@PathVariable ("supplierId")int supplierId){
		this.supplierService.deleteSupplier(supplierId);
		return "redirect:/supplier";
	}
 
	@RequestMapping(value="/editSupplier-{supplierId}")
	public String getSupplierById(@PathVariable ("supplierId")int supplierId,Model model){
		model.addAttribute("supplier",this.supplierService.getSupplierById(supplierId));
		return "supplier";
	
}
}*/