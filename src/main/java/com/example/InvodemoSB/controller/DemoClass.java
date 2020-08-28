package com.example.InvodemoSB.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("innovecture")
public class DemoClass {
	
	@GetMapping("/greet")
	public String getGreetMessage() {
		return "Hello Innovectures.. Have a good day.. ";
	}

}
