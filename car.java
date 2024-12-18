package com.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class car {
	
	@Autowired
	Engin e;
	public String start()
	{
	
		return "car is starting " +e.run();
	}

}
