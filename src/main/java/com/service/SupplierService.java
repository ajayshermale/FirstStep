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
	private SupplierDAOImpl supplierDAO;
	
	
	@Transactional
	public List<Supplier> SupplierList(){
		return this.supplierDAO.SupplierList();
		}
	@Transactional
	public void createSupplier(Supplier supplier){
		supplierDAO.createSupplier(supplier);
	}
	}

