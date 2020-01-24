package com.pizzeria.pedro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pizzeria.pedro.domain.User;
import com.pizzeria.pedro.form.UserForm;
import com.pizzeria.pedro.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping(value="/all")
	public User getUser() {
		return new User("el loco", "apache");
	}
	
	@PostMapping(path = "/register", consumes = "application/json", produces = "application/json")
	public void addMember(@RequestBody UserForm userForm) {
	    userService.registerUser(userForm);
	}
}
