package com.data;

import org.springframework.stereotype.Component;

@Component("regularuser")
public class RegularUser {
	String name="Regular user";
	String role="user";
	
	public String getuserinfo()
	{
		return "name of user "+name+" role is " +role;
	}

}
