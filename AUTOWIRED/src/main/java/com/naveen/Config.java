package com.naveen;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"com.naveen"})
public class Config 
{
	@Bean
	public Student student()
	{
		Student s= new Student(1,"krishna");
		Student student = new Student();
		s.setSid(2);
		s.setSid(22);
		s.setSname("ram");
		return s;
	}
	/*@Bean
	public Student stud()
	{
		return new Student(2,"ram");
	}*/
	@Bean
	public Student setStudent()
	{
		Student student = new Student();
		student.setSid(2);
		student.setSname("ram");
		return student;
	}
}
