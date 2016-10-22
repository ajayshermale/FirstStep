package com.daoimplementation;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dao.SupplierDAO;
import com.firststep.model.Supplier;
@Repository
public class SupplierDAOImpl implements SupplierDAO
{
	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<Supplier> SupplierList() {
		List<Supplier> SupplierList=this.sessionFactory.getCurrentSession().createQuery("from Supplier").getResultList();
		return SupplierList;
	}

	public void createSupplier(Supplier supplier) {
		sessionFactory.getCurrentSession().saveOrUpdate(supplier);
		
	}
	

}
