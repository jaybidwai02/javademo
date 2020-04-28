package com.jay.springcore.map;

import java.util.Map;
import java.util.Properties;

public class Customer {
	private int id;
	private Map<Integer, String> products;
	private Properties countryAndLanguages;

	@Override
	public String toString() {
		return "Customer [id=" + id + ", products=" + products + ", countryAndLanguages=" + countryAndLanguages + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Map<Integer, String> getProducts() {
		return products;
	}

	public void setProducts(Map<Integer, String> products) {
		this.products = products;
	}

	public Properties getCountryAndLanguages() {
		return countryAndLanguages;
	}

	public void setCountryAndLanguages(Properties countryAndLanguages) {
		this.countryAndLanguages = countryAndLanguages;
	}
}
