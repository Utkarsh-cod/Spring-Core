package com.example.FlightBookingApplication.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.FlightBookingApplication.Database.FlightList;
import com.example.FlightBookingApplication.Entity.Flight;

@Component
public class FlightRepository 
{
	@Autowired
	private FlightList flightlistobj;
	
	public List<Flight> getList()
	{
		return flightlistobj.getAllFlights();
	}
}
