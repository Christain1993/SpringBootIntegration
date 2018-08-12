package com.bus365.root.service;

import com.bus365.root.model.User;

public interface UserService {
	public String add(User user);

	public String find(Long id);

	public String delete(Long id);

	public String update(User user); 
	
}
