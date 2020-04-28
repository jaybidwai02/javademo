package com.jay.spring.springjavaconfig.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.jay.spring.springjavaconfig.dao.Dao;

public class DaoService {
	
	@Autowired
	Dao dao;
	
	public void init() {
		System.out.println("Inside init()");
	}
	
	public void destroy() {
		System.out.println("Inside destroy()");
	}

	public void save() {
		dao.create();
	}
}
