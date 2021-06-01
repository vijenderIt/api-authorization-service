package com.upwork.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {

	@RequestMapping({ "/testAPI" })
	public String firstPage() {
		return "API is authenticated";
	}
}
