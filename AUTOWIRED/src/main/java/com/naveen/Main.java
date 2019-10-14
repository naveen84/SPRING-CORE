package com.naveen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		Student stud = (Student)ctx.getBean("student");
		System.out.println(stud);
		/*Student stud1 =(Student)ctx.getBean("setStudent");
		System.out.println(stud1);*/
	/*	Student stud1 =(Student)ctx.getBean("stud");
		stud.show();
		System.out.println(stud);
		System.out.println(stud1);
		System.out.println(stud.hashCode());
		System.out.println(stud1.hashCode());*/
		
	}

}
