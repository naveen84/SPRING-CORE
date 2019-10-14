package com.naveen;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Configuration
@ComponentScan(basePackages="com.naveen",
               /*excludeFilters={@ComponentScan.Filter(Repository.class),
               @ComponentScan.Filter(type=FilterType.ASSIGNABLE_TYPE,value=EmployeeService.class),
               @ComponentScan.Filter(type=FilterType.ANNOTATION,value=Component.class)},*/
               includeFilters={@ComponentScan.Filter(type=FilterType.ASSIGNABLE_TYPE,value=Employee.class)}

)
public class EmpConfig 
{

}
