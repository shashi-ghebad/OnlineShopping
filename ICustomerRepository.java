package com.cg.onlineshoppingapps.dao;

import java.util.List;

import com.cg.onlineshoppingapps.pojo.Customer;

public interface ICustomerRepository {

	public Customer addCustomer(Customer cust);

	public Customer updateCustomer(Customer cust);

	public Customer removeCustomer(Customer cust);

	public Customer viewCustomer(Customer cust);

	public List<Customer> ViewAllCustomers(String location);

}
