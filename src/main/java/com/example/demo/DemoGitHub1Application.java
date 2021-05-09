package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoGitHub1Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoGitHub1Application.class, args);
	
	}
	
	
	@Bean
	public void main(String name) {
		name.equals(name);
	}

}
