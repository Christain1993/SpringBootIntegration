package com.bus365.root.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bus365.root.dao.CityDao;
import com.bus365.root.model.City;
import com.bus365.root.service.CityService;
@Service
public class CityServiceImpl implements CityService {
	@Autowired
	CityDao cityDao;

	@Override
	public List<City> findByName(String name) {
		return cityDao.getByNameLike(name);
	}

	@Override
	public String save(City city) {
		return cityDao.save(city);
	}
	
	@Override
	public List<City> getByNameAndProvince(String name,String province) {
		return cityDao.getByNameAndProvince(name, province);
	}

}
