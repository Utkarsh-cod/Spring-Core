package com.example.VotingApplication;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("authoritycounter")
public class AuthorityCounter implements Authority 
{
	private UserList userList;
	
	@PostConstruct
	public void init()
	{
		System.out.println("\nDB Connection Sucessfull !!");
	}
	 
	@PreDestroy
	public void destroy()
	{
		System.out.println("!!! THANK YOU !!!");
	}
	
	@Override
	public void setUserList(UserList userList) 
	{
		this.userList=userList;
	}

	@Override
	public UserList getUserList() 
	{
		return userList;
	}

}
