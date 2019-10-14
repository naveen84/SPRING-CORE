package com.naveen;

import org.springframework.beans.factory.annotation.Value;

public class Address 
{
	//@Value(value="${}")
	private String district;
	private String city;
	
	public Address() {
		super();
	}

	public Address(String district, String city) {
		super();
		this.district = district;
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [district=" + district + ", city=" + city + "]";
	}
	
}
