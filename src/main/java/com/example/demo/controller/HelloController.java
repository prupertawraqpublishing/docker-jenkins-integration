package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/index")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	
	@GetMapping("/index/v1")
	public String index1() {
		return "Calling /index/v1 .....!";
	}
}
