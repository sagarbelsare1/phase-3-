<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% session.setAttribute("firsttime", true);
		session.setAttribute("username", null);
	%>
	<center><h1><a href="index.jsp" style="text-decoration:none;color:red">Fly Away</a></h1></center>
	<br><br><br>
	<center><h2 style="color:green">You have successfully logout......</h2></center>
</body>
</html>