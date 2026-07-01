package com.example.VotingApplication;
import org.springframework.stereotype.Component;

@Component("aap")
public class AAP implements PoliticalParty 
{
	
	private String partyName="Aam Aadmi Party";
	@Override
	public String getPartyName() 
	{
		return partyName;
	}

}