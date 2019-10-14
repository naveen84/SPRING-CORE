package com.naveen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
	ApplicationContext context = new ClassPathXmlApplicationContext("springtype.xml");	
	Book book = (Book)context.getBean(Book.class);
	System.out.println(book);
	}

}
