<html>
<body>
<center><h1><u>Fly Away</u></h1>
		
		<% 
		    boolean firsttime=true; 
			if(session.getAttribute("firsttime")!=null){
				if((boolean)session.getAttribute("firsttime")==false){
					firsttime=(boolean)session.getAttribute("firsttime");
				}
			}
			
			if(firsttime){
		%>
		<B><a href="login" style="text-decoration:none;color:red"> Login as admin</a></B><br>
		<B><a href="RegistrationServlet" style="text-decoration:none;color:red">Register as admin</a></B>
		<%
			}
			else{
			
		%>
			<B>Welcome <%=session.getAttribute("username")  %></B><br>
			
			<a href="getAllDetails.jsp" style="text-decoration:none;color:red">View all planes in Detail</a><br>
			<a href="insertFlight.jsp" style="text-decoration:none;color:red">Insert a new Flight</a><br>
			<a href="ChangePassword.jsp" style="text-decoration:none;color:red" >Change Password</a><br>
			
			<% } %>
			
		<h2>Fill the form to see the available flights for your journey</h2>
			<form method="POST" action=searchResultsServlet >
			<table style="border:black solid;padding:2%" >
			<tr><th><h3><U>Travel Details</U></h3></th></tr>
			
				<tr><td>From:- <input type="text" name="from"></td></tr><br>
				<tr><td>To:-<input type="text" name="to"></td></tr><br>
				<tr><td>Date:-<input type="date" name="date"></td></tr><br>
				<tr><td>No Of Passengers:-<input type="number" name="passengers"></td></tr><br>
				<tr><td align="center"><input type="submit" ></tr></td>
				</table>
			</form>
			<% 
				if(!firsttime){
			%>
			<a href="logOut.jsp" style="text-decoration:none;color:red">Log Out</a>
			<% 
				}
			%>
			</center>

</body>
</html>
