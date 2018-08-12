package com.bus365.root.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("test")
	public String helloworld() {
		return "helloworld";
	}
}
