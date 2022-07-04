<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Tickets</title>
</head>
<body>
<center><h1><a href="index.jsp" style="text-decoration:none;color:red">Fly Away</a></h1></center>
		<center><h2>Book Ticket Form</h2></center>
		<form method="post" action="bookTicketsServlet" align="center">
			<%
				String s=(String)session.getAttribute("noOfPassengers");
				int n=Integer.parseInt(s);
				for(int i=0;i<n;i++){
			%>
			<h2><u>Member <%=(i+1) %> Details:</u></h2>
			<br>
			Name:<input type="text" name="name"><br>
			Father's Name:<input type="text" name="fname"><br>
			Age:<input type="number" name="age"><br>
			<br>
			<br>
			<% } %>
			<input type="submit" value="Pay">
		</form>
</body>
</html>