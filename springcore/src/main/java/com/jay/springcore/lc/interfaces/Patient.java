package com.jay.springcore.lc.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean, DisposableBean {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside Setter");
		this.id = id;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
	
	public void start() {
		System.out.println("Inside Start:init");
	}
	
	public void end() {
		System.out.println("Inside End:destroy");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside afterPropSet");
		
	}
	
}
