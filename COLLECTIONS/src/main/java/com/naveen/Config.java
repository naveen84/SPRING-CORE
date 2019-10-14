package com.naveen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"com.naveen"})
public class Config 
{
	@Bean
	public Student stud()
	{
		List<Double> list = new ArrayList();
		list.add(99.9);
		list.add(99.99);
		list.add(99.90);
		Set<String> set = new LinkedHashSet();
		set.add("english");
		set.add("maths");
		set.add("science");
		Map<String,String> map = new HashMap();
		map.put("english", "ram");
		map.put("maths", "durga");
		map.put("science", "cv");
		Properties props = new Properties();
		props.put("english", "a+");
		props.put("maths","a");
		props.put("science", "a");
		Student student = new Student(1,"krishna",set,list,map,props);
		return student;
	}
}
