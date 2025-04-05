package com.example.javaapi;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPIController {
	
	@GetMapping("/api/health")
	public Map<String,String> healthCheck(){
		return Map.of("status","API is running");
	}
}
