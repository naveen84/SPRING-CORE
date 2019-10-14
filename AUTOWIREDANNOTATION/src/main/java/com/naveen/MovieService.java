package com.naveen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service()
public class MovieService 
{
	@Autowired
	@Qualifier("movieDaoImpl")
	private MovieDao dao;
	
	public void registerMovie()
	{
		dao.saveMovie();
	}
}
