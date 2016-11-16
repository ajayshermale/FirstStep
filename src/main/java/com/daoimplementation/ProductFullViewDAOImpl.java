package com.daoimplementation;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dao.ProductFullViewDAO;
import com.firststep.model.ProductFullView;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


@Repository
public class ProductFullViewDAOImpl implements ProductFullViewDAO
{
	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public String stringproductFullView() {

		Gson list = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
		List<ProductFullView> productfullviewlist = sessionFactory.getCurrentSession().createQuery("from ProductFullView").getResultList();
		String productjson= list.toJson(productfullviewlist);
		return productjson ;

	}

	@SuppressWarnings("unchecked")
	public ProductFullView getProductFullViewById(int productId)
	{
		String sql = "from ProductFullView where productId="+productId;
		List<ProductFullView> productlist = sessionFactory.getCurrentSession().createQuery(sql).getResultList();
		if(productlist!=null && !productlist.isEmpty())
		{
			return productlist.get(0);
		}
		else return productlist.get(0);
	   }
	
}
     

