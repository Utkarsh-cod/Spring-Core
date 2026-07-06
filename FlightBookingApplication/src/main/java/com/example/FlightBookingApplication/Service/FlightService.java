package com.example.FlightBookingApplication.Service;

import java.util.*;
import java.util.stream.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FlightBookingApplication.Entity.Flight;

import com.example.FlightBookingApplication.Repository.FlightRepository;


@Service
public class FlightService 
{
	
	@Autowired
	private FlightRepository listobj;
	public List<Flight> getFinalList(String source, String destination)
	{
		return listobj.getList()
				.stream()
				.filter
				(item -> item.getSource().equalsIgnoreCase(source) && item.getDestination().equalsIgnoreCase(destination))
				.collect(Collectors.toList());
	}
}