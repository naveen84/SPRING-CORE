package com.naveen;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean,DisposableBean
{
	private int id;
	private String name;
	private Set<String> subjects;
	private List<Double> marks;
	private Map<String,String> staff;
	private Properties grades;
	
	public Student() {
		super();
	}
	public Student(int id, String name, Set<String> subjects, List<Double> marks, Map<String, String> staff,
			Properties grades) {
		super();
		this.id = id;
		this.name = name;
		this.subjects = subjects;
		this.marks = marks;
		this.staff = staff;
		this.grades = grades;
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
	public Set<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(Set<String> subjects) {
		this.subjects = subjects;
	}
	public List<Double> getMarks() {
		return marks;
	}
	public void setMarks(List<Double> marks) {
		this.marks = marks;
	}
	public Map<String, String> getStaff() {
		return staff;
	}
	public void setStaff(Map<String, String> staff) {
		this.staff = staff;
	}
	public Properties getGrades() {
		return grades;
	}
	public void setGrades(Properties grades) {
		this.grades = grades;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", subjects=" + subjects + ", marks=" + marks + ", staff="
				+ staff + ", grades=" + grades + "]";
	}
	public void destroy() throws Exception
	{
		
		System.out.println("destroy method is called");
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("init method is called");
		
	}
	
	
}
