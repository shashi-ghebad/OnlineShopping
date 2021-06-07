package com.cg.onlineshoppingapps.service;

import java.util.List;

import com.cg.onlineshoppingapps.entity.Product;

public interface IProductService {
	
	public List<Product> viewAllProducts();

	public Product addProduct(Product product);

	public Product updateProduct(Product product);

	public Product viewProduct(int id);

	public List<Product> viewProductsByCategory(String cat);

	public boolean removeProduct(int prodId);
}
