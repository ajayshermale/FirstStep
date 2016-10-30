package com.dao;

import java.util.List;

import com.firststep.model.Supplier;

public interface SupplierDAO {

	public List<Supplier> SupplierList();
    public void createSupplier(Supplier supplier);
    public String stringsupplier();
    public Supplier  getIdByName(String supplierName);
    public void deleteSupplier(int supplierId);
	public Supplier getSupplierById(int supplierId);
}
