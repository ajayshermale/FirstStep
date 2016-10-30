package com.dao;

import java.util.List;

import com.firststep.model.Product;

public interface ProductDAO {

   public void createProduct(Product product);
   public List<Product>listproduct();
   public String stringproduct();
   public void deleteProduct(int productId);
   public Product getProductById(int productId);
   
}
