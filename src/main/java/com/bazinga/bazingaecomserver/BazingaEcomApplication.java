package com.bazinga.bazingaecomserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.bazinga.bazingaecomserver")
@SpringBootApplication
public class BazingaEcomApplication {

	public static void main(String[] args) {
		SpringApplication.run(BazingaEcomApplication.class, args);

	}

}
