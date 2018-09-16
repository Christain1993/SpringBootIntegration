package com.bus365.root.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/log")
@RestController
public class LoggerController {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@RequestMapping("/logtest")
	public String logtest() {
		logger.info("info message");
		logger.error("error message");
		return "success";
	}
}
