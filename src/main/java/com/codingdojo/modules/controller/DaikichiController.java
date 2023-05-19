package com.codingdojo.modules.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DaikichiController {
	
	
	
	@GetMapping("/a")
	public String greetings() {
		return "Welcome";
	}
}
