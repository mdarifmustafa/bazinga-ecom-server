package com.bazinga.bazingaecomserver.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class ProductController {

	@GetMapping("/")
	public String api() {
		return "Welcome to Bazinga E-Commercial API";
	}
	
	@GetMapping("*")
	public String badRequest() {
		return "Bad Request!";
	}

}
