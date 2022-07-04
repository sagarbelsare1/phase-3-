<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br>
<center>
<a href=index.jsp style="color:red;text-decoration:none ;font-size:35px;font-weight:bold;">FlyAway</a></center>
<center><h2><U>Change Password</U></h2><center></center>
<br><br>
<center>
<div  align="center">
<form action=ChangePassword method=post>
	<label for=user>UserName :-</label> <input type="text" name=username  /><br><br>
	<label for=pass>Old Password :-</label> <input type="password" name=password1  /><br><br>
	<label for=pass>New Password :-</label> <input type="password" name=password2  /><br><br>
	<input type=submit value=submit /> <input type=reset />
</form>
</div>
</center>
</body>
</html>