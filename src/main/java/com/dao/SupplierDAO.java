package com.dao;

import java.util.List;

import com.firststep.model.Supplier;

public interface SupplierDAO {

	public List<Supplier> SupplierList();
    public void SaveOrUpdate(Supplier supplierCompanyName);
    public String stringsupplier();
    public Supplier  getIdByName(String supplier);
    // public void deleteSupplier(int supplierId);
	public Supplier getSupplierById(int supplierId);
}
