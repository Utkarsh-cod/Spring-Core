package com.example.VotingApplication;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("simpleuser")
@Scope("prototype")
public class SimpleUser implements User 
{
	private String name="";
	private PoliticalParty partyObj;
	@Override
	public void setUserName(String name) 
	{
		this.name=name;
		
	}

	@Override
	public String getUserName() 
	{
		return name;
	}

	@Override
	public void setPoliticalParty(PoliticalParty partyObj) 
	{
		this.partyObj=partyObj;
		
	}

	@Override
	public PoliticalParty getPoliticalParty() 
	{
		return partyObj;
	}
}