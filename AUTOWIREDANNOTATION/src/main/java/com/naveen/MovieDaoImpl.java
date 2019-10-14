package com.naveen;

import org.springframework.stereotype.Repository;

@Repository
public class MovieDaoImpl implements MovieDao
{
	int i;
	
	
	/*public MovieDaoImpl(int i) {
		super();
		System.out.println("im parameter constructor");
		this.i = i;
	}*/
	public MovieDaoImpl()
	{
		System.out.println("i was called during autowiring of MovieDao ");
	}
	public void saveMovie() 
	{
		System.out.println("movie saved");
		
	}

}
