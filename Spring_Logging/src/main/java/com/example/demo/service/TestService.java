package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Test;

@Service
public class TestService {
	
	Logger log = LoggerFactory.getLogger(TestService.class);

	public Test getMessage(Test test) {
		log.info("Request Body: {}",test);
		String s = test.getSubject().toLowerCase();
		log.debug("Subject in lower case: {}",s);
		return test;
	}
}
