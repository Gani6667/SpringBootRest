package com.gani;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class AlienResource 
{
	@Autowired
	AlienRepository repo;
	
	
	@GetMapping("aliens") // use any get post delete
	public List<Alien> getAliens()
	{
		List<Alien> aliens = (List<Alien>) repo.findAll(); // to find all the details from db mysql, findAll typecast with list
		
		
		
		
		return aliens;
	}
	
	
}

//http://localhost:8080/aliens --- GET
