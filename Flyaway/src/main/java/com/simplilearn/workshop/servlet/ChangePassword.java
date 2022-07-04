package com.simplilearn.workshop.servlet;

import java.sql.SQLException;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.simplilearn.workshop.database.Database;

@WebServlet("/ChangePassword")
public class ChangePassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			String username=request.getParameter("username");
			String password1=request.getParameter("password1");
			String password2=request.getParameter("password2");
			
			try {
				Database data=new Database();
				HttpSession session=request.getSession();
				if(data.changeAdminPassword(username,password1,password2)) {
					session.setAttribute("message", "Password Changed Successfully");
				}
				else {
					session.setAttribute("message", "Invalid Details");
				}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.sendRedirect("login");
			
		}

	}
