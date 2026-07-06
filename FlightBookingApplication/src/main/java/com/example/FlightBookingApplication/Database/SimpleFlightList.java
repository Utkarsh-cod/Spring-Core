package com.example.FlightBookingApplication.Database;

import java.util.*;

import org.springframework.stereotype.Component;

import com.example.FlightBookingApplication.Entity.Flight;

@Component
public class SimpleFlightList implements FlightList 
{
	
	List<Flight> listOfFlights = new ArrayList<>();
	
	public SimpleFlightList() 
	{
		listOfFlights.add(new Flight("FL001", "Delhi", "Hyderabad"));
		listOfFlights.add(new Flight("FL002", "Delhi", "Pune"));
		listOfFlights.add(new Flight("FL003", "Delhi", "Jaipur"));
		listOfFlights.add(new Flight("FL004", "Delhi", "Ahmedabad"));
		listOfFlights.add(new Flight("FL005", "Delhi", "Lucknow"));

		listOfFlights.add(new Flight("FL006", "Mumbai", "Hyderabad"));
		listOfFlights.add(new Flight("FL007", "Mumbai", "Pune"));
		listOfFlights.add(new Flight("FL008", "Mumbai", "Jaipur"));
		listOfFlights.add(new Flight("FL009", "Mumbai", "Ahmedabad"));
		listOfFlights.add(new Flight("FL010", "Mumbai", "Lucknow"));

		listOfFlights.add(new Flight("FL011", "Bangalore", "Hyderabad"));
		listOfFlights.add(new Flight("FL012", "Bangalore", "Pune"));
		listOfFlights.add(new Flight("FL013", "Bangalore", "Jaipur"));
		listOfFlights.add(new Flight("FL014", "Bangalore", "Ahmedabad"));
		listOfFlights.add(new Flight("FL015", "Bangalore", "Lucknow"));

		listOfFlights.add(new Flight("FL016", "Chennai", "Hyderabad"));
		listOfFlights.add(new Flight("FL017", "Chennai", "Pune"));
		listOfFlights.add(new Flight("FL018", "Chennai", "Jaipur"));
		listOfFlights.add(new Flight("FL019", "Chennai", "Ahmedabad"));
		listOfFlights.add(new Flight("FL020", "Chennai", "Lucknow"));

		listOfFlights.add(new Flight("FL021", "Kolkata", "Hyderabad"));
		listOfFlights.add(new Flight("FL022", "Kolkata", "Pune"));
		listOfFlights.add(new Flight("FL023", "Kolkata", "Jaipur"));
		listOfFlights.add(new Flight("FL024", "Kolkata", "Ahmedabad"));
		listOfFlights.add(new Flight("FL025", "Kolkata", "Lucknow"));
		
		listOfFlights.add(new Flight("FL026", "Delhi", "Hyderabad"));
		listOfFlights.add(new Flight("FL027", "Delhi", "Pune"));
		listOfFlights.add(new Flight("FL028", "Delhi", "Jaipur"));
		listOfFlights.add(new Flight("FL029", "Delhi", "Ahmedabad"));
		listOfFlights.add(new Flight("FL030", "Delhi", "Lucknow"));

		listOfFlights.add(new Flight("FL031", "Mumbai", "Hyderabad"));
		listOfFlights.add(new Flight("FL032", "Mumbai", "Pune"));
		listOfFlights.add(new Flight("FL033", "Mumbai", "Jaipur"));
		listOfFlights.add(new Flight("FL034", "Mumbai", "Ahmedabad"));
		listOfFlights.add(new Flight("FL035", "Mumbai", "Lucknow"));

		listOfFlights.add(new Flight("FL036", "Bangalore", "Hyderabad"));
		listOfFlights.add(new Flight("FL037", "Bangalore", "Pune"));
		listOfFlights.add(new Flight("FL038", "Bangalore", "Jaipur"));
		listOfFlights.add(new Flight("FL039", "Bangalore", "Ahmedabad"));
		listOfFlights.add(new Flight("FL040", "Bangalore", "Lucknow"));

		listOfFlights.add(new Flight("FL041", "Chennai", "Hyderabad"));
		listOfFlights.add(new Flight("FL042", "Chennai", "Pune"));
		listOfFlights.add(new Flight("FL043", "Chennai", "Jaipur"));
		listOfFlights.add(new Flight("FL044", "Chennai", "Ahmedabad"));
		listOfFlights.add(new Flight("FL045", "Chennai", "Lucknow"));

		listOfFlights.add(new Flight("FL046", "Kolkata", "Hyderabad"));
		listOfFlights.add(new Flight("FL047", "Kolkata", "Pune"));
		listOfFlights.add(new Flight("FL048", "Kolkata", "Jaipur"));
		listOfFlights.add(new Flight("FL049", "Kolkata", "Ahmedabad"));
		listOfFlights.add(new Flight("FL050", "Kolkata", "Lucknow"));

	}


	@Override
	public List<Flight> getAllFlights() 
	{
		
		return listOfFlights;
	}

}
