package com.firststep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

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
		return "supplier";
}
	@RequestMapping("/add/supplier")
	public String addSupplier(@ModelAttribute("supplier") Supplier supplier){
		this.supplierService.createSupplier(supplier);
		return "redirect:/supplier";
	
}
}
