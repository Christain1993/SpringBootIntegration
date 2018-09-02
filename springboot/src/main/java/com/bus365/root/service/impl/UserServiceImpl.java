package com.bus365.root.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.bus365.root.dao.UserDao;
import com.bus365.root.dao.UserMongoDao;
import com.bus365.root.model.User;
import com.bus365.root.service.UserService;
import com.bus365.root.utils.Constants;

@Service
@CacheConfig(cacheNames = "users")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	@Autowired
	private UserMongoDao userMongoDao;
	@PersistenceContext
	private EntityManager entityManager;
	
	public String saveUserToMongo(User user){
		User save = userMongoDao.save(user);
		return save.toString();
	}
	
	public List<User> listByName(String name){
		List<User> findByName = userMongoDao.findByName(name);
		return findByName;
	}
	
	public List<User> getlist(){
		@SuppressWarnings("unchecked")
		List<User> resultList = entityManager.createNativeQuery("select * from user",User.class).getResultList();
		return resultList;
	}

	@Cacheable(key ="#p0")
	public String add(User user) {
		User findOne = null;
		try {
			findOne = userDao.getOne(user.getId());
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
			userDao.getOne(id);
		} catch (Exception e) {
			return Constants.FAIL;
		}
		return Constants.SUCCESS;
	}

	@Override
	public String delete(Long id) {
		try {
			userDao.deleteById(id);
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
	
	@Transactional
	public List<Object[]> getUserWithAddrByid(Long id) {
		@SuppressWarnings("unchecked")
		List<Object[]> resultList = entityManager.createNativeQuery(
				"select u.id id,u.age age,u.name name,a.name aname,a.completeaddress addre from user u left join address a on u.addressid = a.id where u.id = :id")
				.setParameter("id", id).getResultList();
		return resultList;
	}

	@Override
	public List<User> getFromMongo(String name) {
		List<User> findByName = userMongoDao.findByName(name);
		return findByName;
	}

	@Override
	public User saveToMongo(User user) {
		User save = userMongoDao.save(user);
		return save;
	}

}
