package com.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diyan.helloSpringBoot.User;

@RestController
public class BootControllerMVC {
	@RequestMapping("/")
	public String sayHello() {
		return "hello";
	}
	
	@RequestMapping("/user")
	public User createUser(User user) {
		user = new User("Sagar", "Kalkani");
		return user;
	}
}
