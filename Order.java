package com.cg.onlineshoppingapps.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id")
	private int orderId;

	@Column(name = "order_date")
	private LocalDate orderDate;

	@Column(name = "order_status")
	private String orderStatus;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "product_order", joinColumns = { @JoinColumn(name = "order_id") }, inverseJoinColumns = {
			@JoinColumn(name = "product_id") })
	// private List product;
	private Set<Product> products = new HashSet<>();

	// @ManyToMany(cascade = CascadeType.ALL)
	// @JoinTable(name = "product_orders", joinColumns = { @JoinColumn(name =
	// "order_id") }, inverseJoinColumns = { @JoinColumn(name = "product_id") })
	// private Set<Product> products = new HashSet<>();

	@ManyToOne
	@JoinColumn(name="customer_id")
	private Customer customer;
	

	public Order() {
		super();
	}

	public Order(int orderId, LocalDate orderDate, String orderStatus, Set<Product> products, Customer customer) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
		this.products = products;
		this.customer = customer;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ", orderStatus=" + orderStatus + ", product="
				+ products + ", customer=" + customer + "]";
	}

}
