package com.jay.spring.springmvcorm.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.jay.spring.springmvcorm.dao.UserDao;
import com.jay.spring.springmvcorm.entity.User;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public int create(User user) {
		Integer result = (Integer) hibernateTemplate.save(user);
		return result;
	}

}
