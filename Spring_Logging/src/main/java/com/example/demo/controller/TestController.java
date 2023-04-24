package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Test;
import com.example.demo.service.TestService;

@RestController
@RequestMapping("/v1")
public class TestController {
	
	Logger log = LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	private TestService testService;

	@PostMapping("/sendMessage")
	public Test getMessage(@RequestBody Test test) {
		log.info("enter in sendMessage rest.");
		return testService.getMessage(test);
	}
	
}
