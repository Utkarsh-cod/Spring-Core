package com.example.VotingApplication;
import org.springframework.stereotype.Component;

@Component("inc")
public class INC implements PoliticalParty 
{
	
	private String partyName="Indian National Congress";
	@Override
	public String getPartyName() 
	{
		return partyName;
	}

}
