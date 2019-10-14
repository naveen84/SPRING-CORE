package com.naveen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		
         ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		//ClassPathXmlApplicationContext c = (ClassPathXmlApplicationContext)context;
		Employee emp = (Employee)context.getBean(Employee.class);
		emp.setSal(360000);
		System.out.println(emp);
		ApplicationContext context2 = new AnnotationConfigApplicationContext(Config.class);
		Employee emp2 = (Employee)context2.getBean(Employee.class);
		System.out.println(emp2);
		//c.close();
		//context.close();
	}

}
