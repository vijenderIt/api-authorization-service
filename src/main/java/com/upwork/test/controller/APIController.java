package com.upwork.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {

	private static final Logger logger = LoggerFactory.getLogger(APIController.class);

	@RequestMapping({ "/testAPI" })
	public String firstPage() {
		logger.info("Test API request received with valid token");
		return "API is authenticated";
	}
}
