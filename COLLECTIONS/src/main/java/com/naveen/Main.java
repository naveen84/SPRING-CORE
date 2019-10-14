package com.naveen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		/*ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Student student = (Student)context.getBean("student");
		System.out.println(student);*/
		Teacher t = (Teacher)context.getBean("t1");
		System.out.println(t);
	
		Teacher ts = (Teacher)context.getBean("t1");
		System.out.println(ts.hashCode());
	
		
		Teacher t1 = (Teacher)context.getBean("t2");
		System.out.println(t1);
		System.out.println(t.hashCode()+" "+t1.hashCode());
	

	}

}
