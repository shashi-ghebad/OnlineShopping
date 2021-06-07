package com.cg.onlineshoppingapps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cg.onlineshoppingapps.entity.Customer;
import com.cg.onlineshoppingapps.service.ICustomerService;

@RestController
@RequestMapping("os")
public class CustomerController {

	@Autowired
	ICustomerService iCustomerService;

	@GetMapping("/customer/{custId}")
	public Customer viewCustomer(@PathVariable("custId") int cust) {
		return iCustomerService.viewCustomer(cust);
	}
}
