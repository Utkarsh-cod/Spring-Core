package com.example.VotingApplication;

import org.springframework.stereotype.Component;

@Component("bjp")
public class BJP implements PoliticalParty 
{
	
	private String partyName="Bhartiya Janta Party";
	@Override
	public String getPartyName() 
	{
		return partyName;
	}

}
