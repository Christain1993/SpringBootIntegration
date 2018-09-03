package com.bus365.root.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bus365.root.model.City;
import com.bus365.root.service.CityService;

@RestController
public class CityController {
	@Autowired
	CityService cityService;
	@RequestMapping(value = "/city" ,method= {RequestMethod.PUT})
	public String saveCity(City city) {
		String save = cityService.save(city);
		return save;
	}
	@RequestMapping(value = "/city/{name}" ,method= {RequestMethod.GET})
	@ResponseBody
	public List<City> findbyname(@PathVariable String name) {
		List<City> findByName = cityService.findByName(name);
		return findByName;
	}
	
	@RequestMapping(value = "/city/{name}/{province}" ,method= {RequestMethod.GET})
	@ResponseBody
	public List<City> getByNameAndProvince(@PathVariable String name,@PathVariable String province) {
		List<City> findByName = cityService.getByNameAndProvince(name,province);
		return findByName;
	}
}
