package com.jay.spring.springjavaconfig.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoSpringConfig {
	@Bean
	public Dao dao() {
		return new Dao();
	}
}
