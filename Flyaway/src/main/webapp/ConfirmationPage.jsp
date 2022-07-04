<%@page import="com.simplilearn.workshop.util.stringUtils"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><h1><a href="index.jsp" style="text-decoration:none;color:red">Fly Away</a></h1></center>
<%
		String passengers=(String)session.getAttribute("noOfPassengers");
		String[] SandD=(String[])session.getAttribute("SandD");
%>
	<br>
	<br>
	<br>
	<br>

	<div style=color:green align="center" >
		Your Tickets for <%=passengers %> passenger of <%=SandD[0] %> to <%=SandD[1] %> plane has been booked Successfully.
	</div>
	
	<br>
	<br>
</body>
</html>