package com.pizzeria.pedro.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pizzeria.pedro.dao.UserDao;
import com.pizzeria.pedro.domain.User;
import com.pizzeria.pedro.form.UserForm;
import com.pizzeria.pedro.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;

	@Override
	public void registerUser(UserForm userDto) {
		
		User user = new User(userDto.getName(), userDto.getSurname());
		userDao.save(user);
	}
}
