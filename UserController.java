package com.cg.onlineshoppingapps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.onlineshoppingapps.entity.User;
import com.cg.onlineshoppingapps.service.ILoginService;


@RestController
@RequestMapping("os")
public class UserController {
	
	@Autowired
	ILoginService iLoginService;
	
	
	@PostMapping("/users")
	public User addUser(@RequestBody User user) {
		return iLoginService.addUser(user);
	}
	
}

