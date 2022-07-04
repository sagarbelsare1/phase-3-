<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flight Lists</title>
</head>
<body>
<center><h1><a href="index.jsp" style="text-decoration:none;color:red">Fly Away</a></h1></center>
		
		<br>
		<center><h3>All the details are listed below:-</h3></center>
	
		
		<%
			List<String[]> flights=(List<String[]>)session.getAttribute("traveldetails");
			
			
			if(flights!=null){
		%>
		
		
		
		<div align="center">
			<table border="1">
				<thead>
					<tr>
						<th>planename</th>
						<th>source</th>
						<th>destination</th>
						<th>date</th>
						<th>time</th>
						<th>price</th>
					</tr>
				</thead>
				<tbody>
					<%
						for(String[] flight:flights){
							
					%>
					<tr>
						<td><%=flight[0]%></td>
						<td><%=flight[1]%></td>
						<td><%=flight[2]%></td>
						<td><%=flight[3]%></td>
						<td><%=flight[4]%></td>
						<td><%=flight[5]%></td>
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
			<h4 style=color:red>No Flights available</h4>
			<%} %>
		</div>
</body>
</html>