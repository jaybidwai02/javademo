package com.jay.spring.springcoreadvanced.autowiring;

public class Address {
	private int hno;
	private String city;
	/**
	 * @return the hno
	 */
	public int getHno() {
		return hno;
	}
	/**
	 * @param hno the hno to set
	 */
	public void setHno(int hno) {
		this.hno = hno;
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
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", city=" + city + "]";
	}

	

}
