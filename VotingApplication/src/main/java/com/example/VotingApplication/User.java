package com.example.VotingApplication;

public interface User 
{
	void setUserName(String name);
	String getUserName();
	void setPoliticalParty(PoliticalParty partyObj);
	PoliticalParty getPoliticalParty();
}
