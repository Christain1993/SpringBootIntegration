package com.bus365.root.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bus365.root.dao.UserDao;
import com.bus365.root.model.User;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	public User add(User user) {
		userDao.save(user);
		return user;
	}
	
}
