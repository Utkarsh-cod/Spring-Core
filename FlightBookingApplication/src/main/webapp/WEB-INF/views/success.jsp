<%@	page import = "com.example.FlightBookingApplication.Entity.Flight" %>
<%@ page import = "java.util.*" %>

<html>

<head>

<title>Flight Results</title>

</head>

<body>

<style>

body {
  font-family: 'Segoe UI', Arial, sans-serif;
  background: #1e1e2f; 
  margin: 0;
  padding: 20px;
  color: #e0e0e0; 
}

h2 {
  background: #2a2a3d; 
  color: #f5f5f5;
  padding: 12px 18px;
  margin: 15px auto;
  border-radius: 8px;
  box-shadow: 0 4px 10px rgba(0,0,0,0.4);
  width: 60%;
  transition: transform 0.2s ease, box-shadow 0.2s ease;
}

h2:hover {
  transform: translateY(-3px);
  box-shadow: 0 6px 14px rgba(0,0,0,0.6);
}

h2:nth-child(odd) {
  border-left: 5px solid #4dabf7; 
}

h2:nth-child(even) {
  border-left: 5px solid #51cf66;
}

@media (max-width: 768px) {
  h2 {
    width: 90%;
    font-size: 16px;
    padding: 10px 14px;
  }
}

</style>
	<%
	
		List<Flight> listobj = (List<Flight>) request.getAttribute("filteredFlights");
	%>
	<%
		for(Flight flight:listobj)
		{
			
	%>
		<h2>The Flight No. is : <%=flight.getFlightNo() %></h2>
		<h2>The Flight Source is : <%=flight.getSource() %></h2>
		<h2>The Flight Destination is : <%=flight.getDestination() %></h2>
		
	<%
		}
	%>	
</body>
</html>