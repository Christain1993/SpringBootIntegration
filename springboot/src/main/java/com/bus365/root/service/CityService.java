package com.bus365.root.service;

import java.util.List;

import com.bus365.root.model.City;

public interface CityService {

	public List<City> findByName(String name);
	public String save(City city);
	public List<City> getByNameAndProvince(String name,String province) ;
}
