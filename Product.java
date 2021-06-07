package com.cg.onlineshoppingapps.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private int productId;

	@Column(name = "product_name")
	private String productName;

	@Column(name = "price")
	private double price;

	@Column(name = "color")
	private String color;

	@Column(name = "dimensions")
	private String dimension;

	@Column(name = "specifications")
	private String specification;

	@Column(name = "manufacturer")
	private String manufacturer;

	@Column(name = "quantity")
	private int quantity;

//	@OneToMany(mappedBy = "products" , cascade=CascadeType.ALL)
//	private Set<Cart> cart = new HashSet<>();

	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "products")
	private Set<Order> order = new HashSet<>();

	public Product() {
		super();
	}

	public Product(int productId, String productName, double price, String color, String dimension,
			String specification, String manufacturer, int quantity, Set<Cart> cart, Category category,
			Set<Order> order) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.color = color;
		this.dimension = dimension;
		this.specification = specification;
		this.manufacturer = manufacturer;
		this.quantity = quantity;
		this.category = category;
		this.order = order;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDimension() {
		return dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public String getSpecification() {
		return specification;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Set<Order> getOrder() {
		return order;
	}

	public void setOrder(Set<Order> order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", color="
				+ color + ", dimension=" + dimension + ", specification=" + specification + ", manufacturer="
				+ manufacturer + ", quantity=" + quantity +  ", category=" + category + ", order="
				+ order + "]";
	}

}
