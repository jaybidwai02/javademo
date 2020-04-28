package com.jay.spring.springcoreadvanced.sterotype.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("Pusad")
	private String city;

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
}
