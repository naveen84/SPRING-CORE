package com.naveen;

import org.springframework.stereotype.Repository;

@Repository("movieDaoImpl2")
public class MovieDaoImpl2 implements MovieDao {

	public void saveMovie() 
	{
		System.out.println("impl2 executed");
	}

}
