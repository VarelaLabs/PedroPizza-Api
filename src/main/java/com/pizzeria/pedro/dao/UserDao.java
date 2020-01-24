package com.pizzeria.pedro.dao;

import java.util.List;

import com.pizzeria.pedro.domain.User;
import com.pizzeria.pedro.template.dao.TemplateDao;

public interface UserDao extends TemplateDao<User, Long>{
	List<User> findAll();
}
