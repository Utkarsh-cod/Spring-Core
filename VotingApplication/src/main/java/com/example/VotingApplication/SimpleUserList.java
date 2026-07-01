package com.example.VotingApplication;

import java.util.*;
import org.springframework.stereotype.Component;

@Component("simpleuserlist")
public class SimpleUserList implements UserList 
{
	private List<User> userList = null;
	public SimpleUserList()
	{
		userList = new ArrayList<>();
	}
	
	@Override
	public void addUser(User user) 
	{
		userList.add(user);
	}

	@Override
	public List<User> getUsersList() 
	{
		return userList;
	}
}