package com.cg.onlineshoppingapps.service;

import java.util.List;

import com.cg.onlineshoppingapps.entity.Cart;
import com.cg.onlineshoppingapps.entity.Product;

public class ICartServiceImpl implements ICartService {
	
	

	public ICartServiceImpl() {
		super();
		
	}

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
