package com.cg.onlineshoppingapps.service;

import java.util.List;

import com.cg.onlineshoppingapps.entity.Customer;

public interface ICustomerService {
	
	public Customer addCustomer(Customer cust);

	public Customer updateCustomer(Customer cust);

	public Customer removeCustomer(Customer cust);

	public Customer viewCustomer(int cust);

	public List<Customer> ViewAllCustomers(String location);

}
