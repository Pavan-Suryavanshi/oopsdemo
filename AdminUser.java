package com.data;

import org.springframework.stereotype.Component;

@Component("adminuser")
public class AdminUser {
	String name="admin user";
	String role="Administrator";
	
	public String getuserinfo()
	{
		return "name of user is "+name+ " role is " +role; 
	}

}
