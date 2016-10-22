package com.dao;

import java.util.List;

import com.firststep.model.Supplier;

public interface SupplierDAO {

	public List<Supplier> SupplierList();
	 public void createSupplier(Supplier supplier);
}
