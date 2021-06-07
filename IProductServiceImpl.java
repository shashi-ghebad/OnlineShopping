package com.cg.onlineshoppingapps.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.onlineshoppingapps.dao.ProductJpaDao;
import com.cg.onlineshoppingapps.entity.Product;

@Service
public class IProductServiceImpl implements IProductService {

	@Autowired
	ProductJpaDao productJpaDao;

	public IProductServiceImpl() {
		super();

	}

	@Override
	public List<Product> viewAllProducts() {
		return productJpaDao.findAll();
	}

	@Override
	public Product addProduct(Product product) {
		return productJpaDao.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		return productJpaDao.save(product);
	}

	@Override
	public Product viewProduct(int id) {
		return null;
	}

	@Override
	public List<Product> viewProductsByCategory(String cat) {
		return null;
	}

	@Override
	public boolean removeProduct(int prodId) {
		productJpaDao.deleteById(prodId);
		return true;
	}

}
