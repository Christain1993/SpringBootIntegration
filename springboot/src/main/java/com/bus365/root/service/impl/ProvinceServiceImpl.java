package com.bus365.root.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import com.bus365.root.dao.ProvinceDao;
import com.bus365.root.model.Province;
import com.bus365.root.service.ProvinceService;
import com.bus365.root.utils.RedisKeyUtil;
@Service
public class ProvinceServiceImpl implements ProvinceService {

	@Autowired
	private ProvinceDao provinceDao;
	
    @Autowired
    private RedisTemplate redisTemplate;
	
	@Override
	public String save(Province province) {
		return null;
		
	}

	@Override
	public String add(Province province) {
		String key = RedisKeyUtil.getKey(province, province.getCode().toString(), province.getProvincecode());
		ValueOperations opsForValue = redisTemplate.opsForValue();
		Object object = opsForValue.get(key);
		if(object == null) {
			opsForValue.set(key, province);
			return "存入redis"+province.toString();
		}
		return province.toString();
	}

	@Override
	public void deleteByid(Long id) {

	}

	@Override
	public String findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
