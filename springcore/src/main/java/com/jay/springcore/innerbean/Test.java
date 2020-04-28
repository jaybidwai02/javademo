package com.jay.springcore.innerbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/jay/springcore/innerbean/config.xml");
		Employee emp = (Employee) ctx.getBean("employee");
		System.out.println(emp.hashCode());
		System.out.println(emp);

		Employee emp1 = (Employee) ctx.getBean("employee");
		System.out.println(emp1.hashCode());
		System.out.println(emp1);

	}

}
