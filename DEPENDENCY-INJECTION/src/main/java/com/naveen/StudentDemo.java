package com.naveen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDemo {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Student student = (Student)context.getBean(Student.class);
		//System.out.println(student.hashCode());
		student.demo();
	}

}
// 