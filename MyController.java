package com.data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.data.AdminUser;
import com.data.RegularUser;
import com.data.car;

@RestController
public class MyController {
	
	//Autowiring By Type 
	@Autowired
	car c;
	
	@GetMapping("/carinfo")
	public String car_start()
	{
		return c.start();
	}
	
	
	//Autowiring by Name
	
	@Autowired
	AdminUser adminuser;
	
	@Autowired
	RegularUser regularuser;

	@GetMapping("/getadmininfo")
	public String getadmininfo()
	{
		return adminuser.getuserinfo();
	}
	
	@GetMapping("/getuserinfo")
	public String getuserinfo()
	{
		return regularuser.getuserinfo();
	}
	
	
	


}
