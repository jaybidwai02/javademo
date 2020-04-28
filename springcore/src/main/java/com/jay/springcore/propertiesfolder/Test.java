package com.jay.springcore.propertiesfolder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/jay/springcore/propertiesfolder/config.xml");
		MyDB myDB = (MyDB) context.getBean("myDB");
		System.out.println(myDB);
	}

}
