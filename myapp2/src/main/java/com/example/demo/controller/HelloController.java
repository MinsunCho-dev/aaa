package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	@GetMapping("/Hello2") 
	public String hello1() {
		System.out.println("hello");
		return "hello";
	}	
	
	@GetMapping("/Hello2") 
	public String Hello2() {
		return "Hello2";
				
	}
	
}
