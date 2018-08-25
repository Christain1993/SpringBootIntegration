package com.bus365.root.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bus365.root.model.Address;
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
	@RequestMapping(value = "/user/{name}", method = { RequestMethod.GET })
	public String findUserByName(@PathVariable String name) {
		User user = userService.findByName(name);
		return user==null?null:user.toString();
	}
	@RequestMapping(value = "/user/{name}/{age}", method = { RequestMethod.GET })
	public String findUserByNameAndAge(@PathVariable String name,@PathVariable Integer age) {
		User user = userService.findByNameAndAge(name,age);
		return user==null?null:user.toString();
	}
	@RequestMapping(value = "/findbynameorage/{name}/{age}", method = { RequestMethod.GET })
	public String findUserByNameOrAge(@PathVariable String name,@PathVariable Integer age) {
		User user = userService.findByNameOrAge(name,age);
		return user==null?null:user.toString();
	}
	@ResponseBody
	@RequestMapping(value = "/user/address/get/{id}" ,method =RequestMethod.GET)
	public List<Object[]> getAddressByid(@PathVariable(value = "id") Long id) {
		List<Object[]> userWithAddrByid = userService.getUserWithAddrByid(id);
		return userWithAddrByid;
	}
}
