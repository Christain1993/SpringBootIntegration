package com.bus365.root.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bus365.root.dao.UserDao;
import com.bus365.root.model.User;
import com.bus365.root.service.UserService;
import com.bus365.root.utils.Constants;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	public String add(User user) {
		User findOne = null;
		try {
			findOne = userDao.findOne(user.getId());
		} catch (Exception e) {
		}
		if(findOne!=null) {
			return Constants.FAIL;
		}
		try {
			userDao.save(user);
		} catch (Exception e) {
			return Constants.FAIL;
		}
		return Constants.SUCCESS;
	}

	@Override
	public String find(Long id) {
		try {
			userDao.findOne(id);
		} catch (Exception e) {
			return Constants.FAIL;
		}
		return Constants.SUCCESS;
	}

	@Override
	public String delete(Long id) {
		try {
			userDao.delete(id);
		} catch (Exception e) {
			return Constants.FAIL;
		}
		return Constants.SUCCESS;
	}

	@Override
	public String update(User user) {
		try {
			userDao.save(user);
		} catch (Exception e) {
			return Constants.FAIL;
		}
		return Constants.SUCCESS;
	}

	@Override
	public User findByName(String name) {
		User user = userDao.findByName(name);
		return user;
	}

	@Override
	public User findByNameAndAge(String name, Integer age) {
		User user = userDao.findByNameAndAge(name,age);
		return user;
	}

	@Override
	public User findByNameOrAge(String name, Integer age) {
		User user = userDao.findByNameOrAge(name,age);
		return user;
	}

}
