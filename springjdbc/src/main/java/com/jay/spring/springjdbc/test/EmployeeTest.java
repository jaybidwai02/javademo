package com.jay.spring.springjdbc.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jay.spring.springjdbc.dao.EmployeeDao;
import com.jay.spring.springjdbc.entity.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/jay/spring/springjdbc/test/employee-config.xml");
		EmployeeDao employeeDao = (EmployeeDao) context.getBean("employeeDao");
		/*
		 * Employee employee = new Employee(); employee.setId(2);
		 * employee.setFirstName("Anup"); employee.setLastName("Bidwai"); int result =
		 * employeeDao.create(employee);
		 */
		Employee emp = employeeDao.read(1);
		System.out.println("Number of record inserted: " + emp);
		
		List<Employee> allEmp = employeeDao.read();
		System.out.println("All records: " + allEmp);
	}

}
