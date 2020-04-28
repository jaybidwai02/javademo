package com.jay.springcore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/jay/springcore/map/config.xml");
		Customer customer = (Customer) ctx.getBean("customer");
		System.out.println(customer);

	}

}
