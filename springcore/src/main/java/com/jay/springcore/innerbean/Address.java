package com.jay.springcore.innerbean;

public class Address {
	private int hno;
	private String city;

	public int getHno() {
		return hno;
	}

	@Override
	public String toString() {
		return "Address [hno=" + hno + ", city=" + city + "]";
	}

	public void setHno(int hno) {
		this.hno = hno;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
