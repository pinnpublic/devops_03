package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Devops03Application extends SpringBootServletInitializer { 
	
	@Override
	  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	    return builder.sources(Devops03Application.class);
	  }

	public static void main(String[] args) {
		SpringApplication.run(Devops03Application.class, args);
	}

}