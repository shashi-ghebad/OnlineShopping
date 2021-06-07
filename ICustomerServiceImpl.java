package com.cg.onlineshoppingapps.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.onlineshoppingapps.dao.CustomerJpaDao;
import com.cg.onlineshoppingapps.entity.Customer;

@Service
public class ICustomerServiceImpl implements ICustomerService {
	
	@Autowired
	CustomerJpaDao customerJpaDao;
	

	public ICustomerServiceImpl() {
		super();
		
	}

	@Override
	public Customer addCustomer(Customer cust) {
		return null;
	}

	@Override
	public Customer updateCustomer(Customer cust) {
		return null;
	}

	@Override
	public Customer removeCustomer(Customer cust) {
		return null;
	}

	@Override
	public Customer viewCustomer(int cust) {
		Optional<Customer>result= customerJpaDao.findById(cust);
		if(result.isPresent()){
			return result.get();
		}
		return null;
	}

	@Override
	public List<Customer> ViewAllCustomers(String location) {
		return null;
	}

}

