package com.jay.spring.springcoreadvanced.injecting.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("bo")
public class OrderBoImpl implements OrderBO {
	
	@Autowired
	@Qualifier("dao2")
	private OrderDAO dao;

	/**
	 * @return the dao
	 */
	public OrderDAO getDao() {
		return dao;
	}

	/**
	 * @param dao the dao to set
	 */
	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}

	@Override
	public void placeOrder() {
		System.out.println("Inside order bo impl");
		dao.createOrder();
	}

}
