package com.naveen;

public class Student {
	
	private int i;
	
	public Student() {
		super();
	}

	public Student(int i) {
		this.i = i;
		System.out.println("Parameter constructor "+i);
	}
	
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public void demo()
	{
		System.out.println("demo()"+i);
	}
	
}
