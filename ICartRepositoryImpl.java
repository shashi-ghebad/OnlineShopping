package com.cg.onlineshoppingapps.dao;

import java.util.List;

import com.cg.onlineshoppingapps.pojo.Cart;
import com.cg.onlineshoppingapps.pojo.Product;

public class ICartRepositoryImpl implements ICartRepository {

	@Override
	public Cart addProductToCart(Cart cart, Product p, int quantity) {
		return null;
	}

	@Override
	public Cart removeProductFromCart(Cart cart, Product p) {
		return null;
	}

	@Override
	public Cart updateProductQuantity(Cart cart, Product p, int quantity) {
		return null;
	}

	@Override
	public Cart removeAllProducts(Cart cart) {
		return null;
	}

	@Override
	public List<Product> viewAllProducts(Cart cart) {
		return null;
	}

}
