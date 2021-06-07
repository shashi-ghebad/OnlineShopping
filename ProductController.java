package com.cg.onlineshoppingapps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cg.onlineshoppingapps.entity.Product;
import com.cg.onlineshoppingapps.service.IProductService;

@RestController
@RequestMapping("os")
public class ProductController {
	
	@Autowired
	IProductService iProductService;
	
	@GetMapping("/products")
	public List<Product> viewAllProducts() {
		return iProductService.viewAllProducts();
	}
	
	@DeleteMapping("/products/{productId}")
	public boolean removeProduct(@PathVariable("productId") int prodId) {
		return iProductService.removeProduct(prodId);
	}
	@PutMapping("/products")
	public Product updateProduct(@RequestBody Product product) {
		return iProductService.updateProduct(product);
	}
	@PostMapping("/products")
	public Product addProduct(@RequestBody Product product) {
		return iProductService.addProduct(product);
	}
	
}
