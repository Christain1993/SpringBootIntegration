package com.bus365.root.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bus365.root.model.User;


public interface UserMongoDao extends MongoRepository<User, String>{
	List<User> findByName(String name);
	User save(User User);
}
