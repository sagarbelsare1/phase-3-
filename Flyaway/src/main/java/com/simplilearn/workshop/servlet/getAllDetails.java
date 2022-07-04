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

@WebServlet("/getAllDetails")
public class getAllDetails extends HttpServlet {
		private static final long serialVersionUID = 1L;
	    
		protected void doGet(HttpServletRequest request, HttpServletResponse response) 
				throws ServletException, IOException {

			
			try {
				
				Database data=new Database();
				List<String[]> flights=data.getAllDetails();
				HttpSession session=request.getSession();
				session.setAttribute("Flights", flights);
					
				
			}
			catch(SQLException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			response.sendRedirect("getAllDetails.jsp");
			
		}

	}
