package com.wirekind.gostream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.wirekind.gostream.model.Users;

@ComponentScan(basePackages ="com.wirekind.gostream")
@SpringBootApplication
public class GostreamApplication {
	
	@Autowired
	Users users;

	public static void main(String[] args) {
		SpringApplication.run(GostreamApplication.class, args);
		
	}

}
