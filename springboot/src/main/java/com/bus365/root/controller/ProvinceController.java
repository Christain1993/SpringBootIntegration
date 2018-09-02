package com.bus365.root.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bus365.root.model.Province;
import com.bus365.root.service.ProvinceService;

@RestController
public class ProvinceController {
	@Autowired
	private ProvinceService provinceService;
	@RequestMapping(value = "/province", method = { RequestMethod.PUT })
	public String adduser(Province province) {
		String result = provinceService.add(province);
		return result;
	}
}
