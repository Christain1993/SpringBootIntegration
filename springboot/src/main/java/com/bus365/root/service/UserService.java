package com.bus365.root.service;

import java.util.List;

import com.bus365.root.model.User;

public interface UserService {
	public String add(User user);

	public String find(Long id);

	public String delete(Long id);

	public String update(User user);

	public User findByName(String name);

	public User findByNameAndAge(String name, Integer age);

	public User findByNameOrAge(String name, Integer age); 
	
	public List<User> getlist();
	
	public List<Object[]> getUserWithAddrByid(Long id);
	
	public List<User> getFromMongo(String name);
	
	public User saveToMongo(User user);
	
}
