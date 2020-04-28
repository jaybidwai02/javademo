package com.jay.springcore.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HospitalTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Hospital hospital = (Hospital) ctx.getBean("hospital");
		System.out.println("Hospital Name: "+ hospital.getName());
		System.out.println("Departments: "+ hospital.getDepartments());
				

	}

}
