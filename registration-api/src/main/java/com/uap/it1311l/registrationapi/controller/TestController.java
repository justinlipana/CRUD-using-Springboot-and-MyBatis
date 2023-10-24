package com.uap.it1311l.registrationapi.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class TestController 
{
	@GetMapping("/test")
	public String testApi()
	{
		return "test passed";
	}
}
