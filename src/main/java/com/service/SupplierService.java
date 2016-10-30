package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.daoimplementation.SupplierDAOImpl;
import com.firststep.model.Supplier;

@Service
@Transactional
public class SupplierService {

	@Autowired
	private SupplierDAOImpl supplierDAOImpl;
	
	
	@Transactional
	public List<Supplier> SupplierList(){
		return this.supplierDAOImpl.SupplierList();
		}
	@Transactional
	public void createSupplier(Supplier supplier){
		supplierDAOImpl.createSupplier(supplier);
	}
	@Transactional
	 public String stringsupplier()
	 {
		return this.supplierDAOImpl.stringsupplier();
	 }
	 @Transactional
     public void deleteSupplier(int supplierId) {
		 supplierDAOImpl.deleteSupplier(supplierId);
	    	 }
	    
	  @Transactional
      public Supplier getSupplierById(int supplierId)  {
	    	
	    	return supplierDAOImpl.getSupplierById(supplierId);
	    }

	  @Transactional
      public Supplier getIdByName(String supplierName){
	    	
	    	return  supplierDAOImpl.getIdByName(supplierName);
	    }
	}

