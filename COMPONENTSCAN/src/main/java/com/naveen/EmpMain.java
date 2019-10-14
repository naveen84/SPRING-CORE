package com.naveen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmpMain {

	public static void main(String[] args) 
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(EmpConfig.class);
		/*EmployeeDao dao  = (EmployeeDao)context.getBean("employeeDao");
		dao.saveDao();
		EmployeeService service = (EmployeeService)context.getBean(EmployeeService.class);
		service.saveEmp();*/
		Employee emp = (Employee)context.getBean(Employee.class);
		System.out.println(emp);
	}

}
