package com.jay.spring.springaop;

import org.springframework.stereotype.Component;

import com.jay.spring.springaop.serviceinterface.MathService;

@Component("mathService")
public class MathServiceImpl implements MathService {

	@Override
	public int multiply(int num1, int num2) {
		return num1*num2;
	}

}
