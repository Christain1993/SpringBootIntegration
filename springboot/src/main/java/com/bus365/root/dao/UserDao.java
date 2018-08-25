package com.bus365.root.dao;


import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bus365.root.model.User;

public interface UserDao extends JpaRepository<User,Long>,JpaSpecificationExecutor<User>,Serializable {

	User findByName(String name);

	User findByNameAndAge(String name, Integer age);

	User findByNameOrAge(String name, Integer age);

	
	/*@Query(value = "from User where name = :name")
	List<User> findbyname(@Param("name") String name);*/
}
