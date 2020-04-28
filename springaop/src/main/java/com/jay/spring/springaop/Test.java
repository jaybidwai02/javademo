package com.jay.spring.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jay.spring.springaop.serviceinterface.MathService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		MathService service = (MathService) context.getBean("mathService");
		int multiply = service.multiply(2, 3);
		System.out.println(multiply);
	}

}
