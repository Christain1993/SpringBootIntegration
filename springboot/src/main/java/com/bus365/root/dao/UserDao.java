package com.bus365.root.dao;


import java.io.Serializable;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.bus365.root.model.User;

@CacheConfig(cacheNames = "users")
public interface UserDao extends JpaRepository<User,Long>,JpaSpecificationExecutor<User>,Serializable {

	@Cacheable(key ="#p0") 
	User findByName(String name);

	User findByNameAndAge(String name, Integer age);

	User findByNameOrAge(String name, Integer age);
	
	@CacheEvict(key ="#p0",allEntries=true)
	void deleteById(Long id);

	
	/*@Query(value = "from User where name = :name")
	List<User> findbyname(@Param("name") String name);*/
}
