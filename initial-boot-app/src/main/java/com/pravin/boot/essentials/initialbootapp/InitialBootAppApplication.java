package com.pravin.boot.essentials.initialbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class InitialBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(InitialBootAppApplication.class, args);
	}
	
	@RestController
	@RequestMapping("/api")
	public class ApiController{
		
		@RequestMapping("/greeting")
		public String getGreeting() {
			return "Hello world from the API ";
		}
	}
}
