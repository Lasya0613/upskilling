package com.microservices.controller;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan(basePackages= {"com.microservices.controller"})
@RestController
public class HelloWorldController {
	
	 
	@GetMapping("hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	public static void main(String[] args) {
		

	}

}
