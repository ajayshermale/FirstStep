//
//package com.daoimplementation;
//
//import java.util.List;
//
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import com.dao.SupplierDAO;
//import com.firststep.model.Supplier;
//import com.firststep.model.UserDetail;
//import com.google.gson.Gson;
//@Repository
//public class SupplierDAOImpl implements SupplierDAO
//{
//	@Autowired
//	private SessionFactory sessionFactory;
//	
//	@SuppressWarnings("unchecked")
//	public List<UserDetail> SupplierList() {
//		List<UserDetail> SupplierList=this.sessionFactory.getCurrentSession().createQuery("from UserDetail").getResultList();
//		return SupplierList;
//	}
//
//	public void createSupplier(Supplier supplier) {
//		sessionFactory.getCurrentSession().saveOrUpdate(supplier);
//		
//	}
////	@SuppressWarnings("unchecked")
////	public String stringsupplier() {
////		 Gson list = new Gson();
////			List<Supplier> supplierList = sessionFactory.getCurrentSession().createQuery("from Supplier").getResultList();
////			String supplierjson= list.toJson(supplierList);
////			return supplierjson;
////	}
////
////	public void deleteSupplier(int supplierId) {
////		Supplier supplierToDelete = new Supplier();	
////		supplierToDelete.setSupplierId(supplierId);
////		   sessionFactory.getCurrentSession().delete(supplierToDelete);
////        
////		
////	}

////	@SuppressWarnings("unchecked")
////	public Supplier getSupplierById(int supplierId) {
////		String sql = "from Supplier where supplierId=" +supplierId;
////		List<Supplier> supplierList = sessionFactory.getCurrentSession().createQuery(sql).getResultList();
////		if(supplierList!=null && !supplierList.isEmpty())
////		{
////			return supplierList.get(0);
////		}
////		else return null;
////     	}
//	
//	@SuppressWarnings("unchecked")
//	public UserDetail getByName(String username) 
//	{
//		String sql = "from UserDetail where username= '" +username+"'";
//		List<UserDetail> list = sessionFactory.getCurrentSession().createQuery(sql).getResultList();
//		if(list!=null && !list.isEmpty())
//		{
//			return list.get(0);
//		}
//		else return null;
//	
//	}
//
//}
//	
//
//
