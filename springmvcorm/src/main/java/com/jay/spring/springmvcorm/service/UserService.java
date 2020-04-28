package com.jay.spring.springmvcorm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jay.spring.springmvcorm.dao.UserDao;
import com.jay.spring.springmvcorm.entity.User;
import com.jay.spring.springmvcorm.service.interfaces.UserInterface;

@Service
public class UserService implements UserInterface {
	@Autowired
	private UserDao userDao;

	@Override
	@Transactional
	public int save(User user) {
		/* 
		 * place for business logic 
		 * best practice to mark service method as @Transactional instead of DAO because
		 * service method may have more DB operation in single method
		 * */
		return userDao.create(user);
	}
}
