package com.jay.spring.springaop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingService {
	
	@Before("execution(* com.jay.spring.springaop.MathServiceImpl.multiply(..))")
	void beforeMethodRun(JoinPoint joinPoint) {
		System.out.println("Before method runs");
	}
	
	@After("execution(* com.jay.spring.springaop.MathServiceImpl.multiply(..))")
	void afterMethodRun(JoinPoint joinPoint) {
		System.out.println("After method runs");
	}
}
