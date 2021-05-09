package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoGitHub1Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoGitHub1Application.class, args);
	
	}
	
	public boolean mainsd(String name) {
		return name.equals(name);
	}
	
	public boolean  mainsddsd(String name) {
		return name.equals(name);
	}

	public boolean  mainsddsd1(String name) {
		return name.equals(name);
	}
	@Bean
	public void demo1() {
		mainsd("minh");
		mainsddsd1("caominh");
	}
	
	@Bean
	public void demo12() {
		mainsddsd1("caominh");
		mainsddsd("dsdsds");
	}
	
}
