package com.bus365.root.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bus365.root.model.User;
import com.bus365.root.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService; 

	@RequestMapping("/adduser")	
	public String adduser(User user) {
		User add = userService.add(user);
		return add.toString();
	}
}
