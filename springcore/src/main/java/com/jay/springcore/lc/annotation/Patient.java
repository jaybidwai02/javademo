package com.jay.springcore.lc.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {
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
	
	@PostConstruct	
	public void start() {
		System.out.println("Inside Start:init");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Inside End:destroy");
	}
	
}
