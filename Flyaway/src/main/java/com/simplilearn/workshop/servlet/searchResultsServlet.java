package com.simplilearn.workshop.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.simplilearn.workshop.database.Database;

@WebServlet("/searchResultsServlet")
public class searchResultsServlet extends HttpServlet {
private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		String from=request.getParameter("from");
		String to=request.getParameter("to");
		String date=request.getParameter("date");		
		String passengers=request.getParameter("passengers");
		try {
			
			Database data=new Database();
			List<String[]> flights=data.getFlights(from, to, date);
			HttpSession session=request.getSession();
			session.setAttribute("Flights", flights);
			session.setAttribute("noOfPassengers", passengers);
			
			String[] SandD=new String[2];
			SandD[0]=from;
			SandD[1]=to;
			
			session.setAttribute("SandD", SandD);
			
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		response.sendRedirect("SearchResults.jsp");
		
	}
	
}
	