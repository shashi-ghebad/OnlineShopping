package com.cg.onlineshoppingapps.dao;

import java.util.List;

import com.cg.onlineshoppingapps.pojo.Cart;
import com.cg.onlineshoppingapps.pojo.Product;

public interface ICartRepository {
	public Cart addProductToCart(Cart cart, Product p, int quantity);

	public Cart removeProductFromCart(Cart cart, Product p);

	public Cart updateProductQuantity(Cart cart, Product p, int quantity);

	public Cart removeAllProducts(Cart cart);

	public List<Product> viewAllProducts(Cart cart);
}
