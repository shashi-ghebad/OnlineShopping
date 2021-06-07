package com.cg.onlineshoppingapps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.onlineshoppingapps.entity.Address;
import com.cg.onlineshoppingapps.service.IAddressService;

@RestController
@RequestMapping("os")
public class AddressController {
	
	@Autowired
	IAddressService iAddressService;
	
	@PostMapping("/address")
	public Address addAddress(Address add) {
		return iAddressService.addAddress(add);
		
	}
	
	@GetMapping("/address")
	public List<Address> viewAllAddress(Address add) {
		return iAddressService.viewAllAddress(add);
}	

}
//@GetMapping("/students")
//public List<StudentEntity> getAllStudents(){
//	return studentService.getAllStudents();