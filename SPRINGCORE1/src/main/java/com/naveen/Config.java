package com.naveen;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	@Bean(initMethod="init" ,destroyMethod="des")
	public Employee emp()
	{
		Employee emp = new Employee();
		//emp.setAddress(null);
		emp.setSal(100);
		emp.setId(2);
		emp.setName("ram");
		emp.setAddress(address());
		return emp;
	}
	public Address address(){
		Address ad = new Address();
		
		ad.setCity("chennnai");
		ad.setDistrict("s");
		return ad;
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
