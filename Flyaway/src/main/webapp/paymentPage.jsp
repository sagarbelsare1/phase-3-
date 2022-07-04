<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment Page</title>
</head>
<body>
<center>
	<h1><a href="index.jsp" style="text-decoration:none;color:red">Fly Away</a></h1>
	<h2>Payment Method</h2>
	<br>
		<h3>Enter Your Debit Card Details</h3>
	</center>
	
	<div align="center">
	
		Card Number: <input type="text" maxlength="16" ><br><br>
		Name Of Card Holder:<input type="text" ><br><br>
		Enter Expiry Date:<input type="month"><br><br>
		Enter CVV:<input type="text" maxlength="3"><br><br>
		<h2><a href="ConfirmationPage.jsp"><B>Next</B></a></h2>
		
	</div>
</body>
</html>