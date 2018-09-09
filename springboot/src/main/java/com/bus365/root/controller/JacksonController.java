package com.bus365.root.controller;

import java.security.Timestamp;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bus365.root.model.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class JacksonController {

	@Autowired
	private ObjectMapper objectMapper;
	
	@RequestMapping(value = "/json")
	public String getJson(Long time) throws JsonProcessingException {
		Date date = new Date(time);
		System.out.println(date);
		User user = new User();
		user.setAge(1);
		ObjectMapper om = new ObjectMapper();
		String writeValueAsString = objectMapper.writeValueAsString(date);
		System.out.println(writeValueAsString);
		return "success";
		
	}
}
