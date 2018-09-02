package com.bus365.root.service;

import com.bus365.root.model.Province;

public interface ProvinceService {
	String save(Province province);
	String add(Province province);
	void deleteByid(Long id);
	String findById(Long id);
}
