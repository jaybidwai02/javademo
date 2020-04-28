package com.jay.spring.springcoreadvanced.sterotype.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*
 * By default @Component create bean with name same as class name but in camel case
 * to create bean with diff name use @Component("std") syntax
 * 
 * to change scope on object in spring use @Scope annotation
 * */

@Component
@Scope("prototype")
public class Student {
	
	@Value("20")
	private int id;
	@Value("Jay Bidwai")
	private String name;
	@Value("#{courses}")
	private List<String> courses;
	@Autowired
	private Address address;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", courses=" + courses + ", address=" + address + "]";
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
