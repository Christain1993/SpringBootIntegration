package com.bus365.root.controller;

import java.util.Enumeration;

import javax.servlet.ServletRequest;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/httpclient")
public class HttpClientController {
	
	@RequestMapping("/cookie")
	public String cookietest(HttpServletRequest request) {
		Enumeration<String> headerNames = request.getHeaderNames();
		while(headerNames.hasMoreElements()) {
			String nextElement = headerNames.nextElement();
			System.out.println(nextElement);
		};
		Cookie[] cookies = request.getCookies();
		if(cookies !=null) {
			for (Cookie cookie : cookies) {
				System.out.println(cookie.getName()+cookie.getValue());
			}
		}
		return "success";
		
	}
}
