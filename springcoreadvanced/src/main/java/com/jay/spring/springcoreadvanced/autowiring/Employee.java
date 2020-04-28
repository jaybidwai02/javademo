package com.jay.spring.springcoreadvanced.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	private Address address;
	
	/*
	 * // auto wiring at field leve
	 * @Autowired 
	 * private Address address
	 */
	
	/*
	 * autowiring at constructor level
	 * @Autowired 
	 *Employee(Address address) { this.address = address; }
	 */

	public Address getAddress() {
		return address;
	}

	/*
	 * // autowiring using setter method
	 */
	
	/* 
	 * @Qualifier - use to tell which bean should get injected from confrg
	 * if not found specified bean it throws an exception
	 * if you want to inject null if no bean found set required attribute to @Autowired(required=false)
	 * 
	 *  */
	
	@Autowired
	@Qualifier("address123")
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

}
