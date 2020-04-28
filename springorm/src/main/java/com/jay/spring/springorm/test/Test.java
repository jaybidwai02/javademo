package com.jay.spring.springorm.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jay.spring.springorm.daointerface.ProductDao;
import com.jay.spring.springorm.entity.Product;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/jay/spring/springorm/test/product-config.xml");
		ProductDao productDao = (ProductDao) context.getBean("productDao");
		Product product = new Product();
		product.setId(10);
		product.setName("iPhone");
		product.setDesc("iPhone 7");
		product.setPrice(900);
		int record = productDao.create(product);
		System.out.println("Number of record inserted: " + record);
	}

}
