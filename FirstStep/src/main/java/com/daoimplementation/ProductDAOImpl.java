package com.daoimplementation;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dao.ProductDAO;
import com.firststep.model.Product;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Repository
public class ProductDAOImpl implements ProductDAO
{

	@Autowired
	private SessionFactory sessionFactory;
	
	public void createProduct(Product product)
	{
	  sessionFactory.getCurrentSession().saveOrUpdate(product);
	}
    
	@SuppressWarnings("unchecked")
	public List<Product> listproduct()
	{
		List<Product> productlist = sessionFactory.getCurrentSession().createQuery("from Product").getResultList();
		return productlist;
	}
  
	@SuppressWarnings("unchecked")
	public String stringproduct() 
	{
		Gson list = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
		List<Product> productlist = sessionFactory.getCurrentSession().createQuery("from Product").getResultList();
		String productjson= list.toJson(productlist);
		return productjson ;
	}

	public void deleteProduct(int productId) 
	{
		Product productToDelete=new Product();
		productToDelete.setProductId(productId);
		sessionFactory.getCurrentSession().delete(productToDelete);
	}

	@SuppressWarnings("unchecked")
	public Product getProductById(int productId) {
		
		String sql = "from Product where productId=" +productId;
		List<Product> productlist = sessionFactory.getCurrentSession().createQuery(sql).getResultList();
		if(productlist!=null && !productlist.isEmpty())
		{
			return productlist.get(0);
		}
		else return null;
	}

	public void subProduct(int productId) {

		String sql = "update Product set quantity=quantity-1 where productId=" +productId;
		sessionFactory.getCurrentSession().createQuery(sql).executeUpdate();
	}

	public void addProduct(int productId) {
		String sql = "update Product set quantity=quantity+1 where productId=" +productId;
		sessionFactory.getCurrentSession().createQuery(sql).executeUpdate();
		
	}
     
}
