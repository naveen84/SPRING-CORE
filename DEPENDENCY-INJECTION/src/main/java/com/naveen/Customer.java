package com.naveen;

public class Customer {
	
	private String city;
	private String country;
	public Customer(String city, String country) {
		super();
		this.city = city;
		this.country = country;
	}
	public Customer() {
		super();
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Customer [city=" + city + ", country=" + country + "]";
	}
	

}
