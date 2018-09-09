package com.bus365.root.controller;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/kafka")
public class KafkaController {
    @Autowired
    private KafkaTemplate kafkaTemplate;

    @RequestMapping(value = "/send", method = RequestMethod.GET)
    public String sendKafka(HttpServletRequest request, HttpServletResponse response) {
    	
        try {
        	String message = request.getParameter("message");
        	kafkaTemplate.send("test", "key", message);
            return "success";
        } catch (Exception e) {
            return "false";
        }
    }

}