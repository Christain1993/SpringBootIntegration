package com.bus365.root.dao;

import java.util.List;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.bus365.root.model.City;

@Repository
public class CityDao {	
	@Autowired
	MongoTemplate mongoTemplate;
	
	public List<City> getByNameLike(String name) {
		Query query = new Query();
		Criteria criteria = new Criteria();
		Pattern pattern = Pattern.compile("^.*"+name+".*$", Pattern.CASE_INSENSITIVE);
		query.addCriteria(criteria.and("name").regex(pattern));
		List<City> find = mongoTemplate.find(query, City.class);
		return find;
	}
	
	public List<City> getByNameAndProvince(String name,String province) {
		Query query = new Query();
		Criteria criteria = new Criteria();
		Pattern pattern = Pattern.compile("^.*"+name+".*$", Pattern.CASE_INSENSITIVE);
		query.addCriteria(criteria.and("name").regex(pattern));
		query.addCriteria(criteria.where("province").is(province));
		List<City> find = mongoTemplate.find(query, City.class);
		return find;
	}
	
	public String save(City city) {
		mongoTemplate.insert(city);
		return "SUCCESS";
	}

}
