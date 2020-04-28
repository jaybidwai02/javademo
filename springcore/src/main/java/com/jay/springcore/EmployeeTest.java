package com.jay.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/jay/springcore/config.xml");
		Employee emp = (Employee) ctx.getBean("emp");
		System.out.println("Emp Id: "+ emp.getId());
		System.out.println("EMP Name: "+ emp.getName());

	}

}
