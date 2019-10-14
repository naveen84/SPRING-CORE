package com.naveen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MovieMain {

	public static void main(String[] args) 
	{
		
		ApplicationContext context = new AnnotationConfigApplicationContext(MovieConfig.class);
		MovieService service = (MovieService)context.getBean(MovieService.class);
		service.registerMovie();
		
	}

}
