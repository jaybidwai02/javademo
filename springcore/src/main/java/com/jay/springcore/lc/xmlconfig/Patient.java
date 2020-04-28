package com.jay.springcore.lc.xmlconfig;

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
	
	public void start() {
		System.out.println("Inside Start:init");
	}
	
	public void end() {
		System.out.println("Inside End:destroy");
	}
	
}
