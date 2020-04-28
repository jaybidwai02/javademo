package com.jay.spring.springjdbc.dao;

import java.util.List;

import com.jay.spring.springjdbc.entity.Employee;

public interface EmployeeDao {
	public int create(Employee employee);
	
	Employee read(int id);
	
	List<Employee> read();
}
