package com.example.amdocs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@SpringBootApplication
public class AmdocsApplication {
	
	@GetMapping("/msg")
	public String tejas() {
		return "I am Great";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(AmdocsApplication.class, args);
	}

}
