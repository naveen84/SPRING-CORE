package com.naveen;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean , DisposableBean
{
	private int id;
	private String name;
	private double sal;
	private Address address;
	
	public Employee() {
		super();
	}
	public Employee(int id, String name, double sal, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.address = address;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", address=" + address + "]";
	}
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("INITILIZING BEAN IS CALLED");
	}
	public void destroy() throws Exception {
		
		System.out.println("DISPOSABLE BEAN IS CALLED");
	}
	
	public void init()
	{
		System.out.println("CUSTOM INIT METHOD");
	}
	public void des()
	{
		System.out.println("DESTROY METHOD IS CALLED");
	}
	/*@PostConstruct
	public void pc()
	{
		System.out.println("ANNOTATION PC CALLED");
	}
	@PreDestroy
	public void pd()
	{
		System.out.println("ANNOTATION PD CALLED");
	}*/
}
