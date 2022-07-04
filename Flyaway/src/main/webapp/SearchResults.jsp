<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flight Lists</title>
</head>
<body>
<center><h1><a href="index.jsp" style="text-decoration:none;color:red">Fly Away</a></h1></center>
		<br>
		<br>
		<% String[] SandD=(String[])session.getAttribute("SandD"); %>
		
		<br>
		
		<%
			List<String[]> flights=(List<String[]>)session.getAttribute("Flights");
			
			
			if(flights!=null){
		%>
		
		<center><h2>List of available flights From <%=SandD[0] %> To <%=SandD[1] %> :</h2></center>
		
		<div align="center">
			<table border="1">
				<thead>
					<tr>
						<th>Plane Name</th>
						<th>Time</th>
						<th>Price</th>
						<th>Status</th>
					</tr>
				</thead>
				<tbody>
					<%
						for(String[] flight:flights){
							
					%>
					<tr>
						<td><%=flight[0]%></td>
						<td><%=flight[1] %></td>
						<td><%=flight[2] %></td>
						<td><a href="bookTickets.jsp">Book Now</a></td>
					</tr>
					<% 
							}
					%>
					
				</tbody>
			</table>
			<%
				}
			else{
				
			%>
			<h4 style=color:red>No Flights available for this root right now</h4>
			<%} %>
		</div>
		
</body>
</html>