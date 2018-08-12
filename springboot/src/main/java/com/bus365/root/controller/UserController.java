package com.bus365.root.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bus365.root.model.User;
import com.bus365.root.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/user", method = { RequestMethod.PUT })
	public String adduser(User user) {
		String result = userService.add(user);
		return result;
	}
	@RequestMapping(value = "/user", method = { RequestMethod.GET })
	public String finduser(Long id) {
		String find = userService.find(id);
		return find;
	}
	@RequestMapping(value = "/user", method = { RequestMethod.POST })
	public String updateuser(User user) {
		String update = userService.update(user);
		return update;
	}
	@RequestMapping(value = "/user", method = { RequestMethod.DELETE })
	public String deleteuser(Long id) {
		String delete = userService.delete(id);
		return delete;
	}
}
