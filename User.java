package com.cg.onlineshoppingapps.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	@Id
	@Column(name = "user_id")
	private String userId;

	@Column(name = "password")
	private String password;

	@Column(name = "role")
	private String role;

	@OneToOne(mappedBy="user")
//	@JoinColumn(name="customer_id")
	private Customer customer;

	

	public User() {
		super();
	}


	public User(String userId, String password, String role, Customer customer) {
		super();
		this.userId = userId;
		this.password = password;
		this.role = role;
		this.customer = customer;
	}


	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + ", role=" + role + ", customer=" + customer + "]";
	}

	

}
