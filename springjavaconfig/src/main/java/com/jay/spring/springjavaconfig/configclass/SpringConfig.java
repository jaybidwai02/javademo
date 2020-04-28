package com.jay.spring.springjavaconfig.configclass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.jay.spring.springjavaconfig.dao.DaoSpringConfig;
import com.jay.spring.springjavaconfig.service.DaoService;

@Configuration
@Import(DaoSpringConfig.class)
public class SpringConfig {
	
	@Bean(initMethod = "init", destroyMethod = "destroy")
	public DaoService service() {
		return new DaoService();
	}
}
