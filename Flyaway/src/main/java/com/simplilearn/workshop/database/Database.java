package com.simplilearn.workshop.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.simplilearn.workshop.util.stringUtils;


public class Database {

	public Connection con=null;
	public Statement st=null;

	public Database() throws SQLException, ClassNotFoundException {
		String url="jdbc:mysql://localhost:3306/flyaway?allowPublicKeyRetrieval=true&useSSL=false";
		String user="Sagarbelsare";
		String password="Sagar@bel9";
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, user, password);
			System.out.println("Got Connection ");
			st=con.createStatement();
		
	}

	public List<String[]> getFlights(String from,String to,String date){
		List<String[]> flights=new ArrayList();
		String sql="SELECT planename,time,price FROM traveldetails WHERE source='"+stringUtils.fixSqlFieldValue(from)+"' AND destination='"+stringUtils.fixSqlFieldValue(to)+"' AND date='"+stringUtils.fixSqlFieldValue(date)+"' order by time asc";
		try {
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {
				
				
				String [] flight=new String[3];
				flight[0]=rs.getString("planename");
				flight[1]=rs.getString("time");
				flight[2]=rs.getString("price");
				flights.add(flight);
				
				
			}
			return flights;
			
		}
		catch(SQLException e){
			System.out.println(e.toString());
		}
		catch(NullPointerException e) {
			System.out.println(e.toString());
		}
		return null;
	}
	public List<String[]> getAllDetails(){
		List<String[]> flights=new ArrayList();
		String sql="select planename,source,destination,date,time,price from flyaway.traveldetails";
		try {
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {
				
				
				String [] flight=new String[6];
				flight[0]=rs.getString("planename");
				flight[1]=rs.getString("source");
				flight[2]=rs.getString("destination");
				flight[3]=rs.getString("date");
				flight[4]=rs.getString("time");
				flight[5]=rs.getString("price");
				flights.add(flight);
				
				
			}
			return flights;
			
		}
		catch(SQLException e){
			System.out.println(e.toString());
		}
		catch(NullPointerException e) {
			System.out.println(e.toString());
		}
		return null;
	}
	public boolean changeAdminPassword(String username, String password1,String password2) {
		try {
			ResultSet rs=st.executeQuery("select id from admin"
                    + " where username = '"+username+"' and password = '"+password1+"'");
			
			if(!rs.next()) {
				return false;
			}
			
			st.execute("update admin set password='"+password2+"' where id='"+rs.getString("id")+"'");
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	public boolean insertFlight(HashMap<String, String> flight) throws SQLException {
		String query1 = "INSERT INTO traveldetails (planename, source,destination, date, time, price) VALUES" + " ('"
				+ stringUtils.fixSqlFieldValue(flight.get("name")) + "'," + " '" + stringUtils.fixSqlFieldValue(flight.get("from")) + "'," + " '"
				+ stringUtils.fixSqlFieldValue(flight.get("to")) + "'," + " '" + stringUtils.fixSqlFieldValue(flight.get("date")) + "'," + " '"
				+ stringUtils.fixSqlFieldValue(flight.get("time")) + "'," + " '" + stringUtils.fixSqlFieldValue(flight.get("price")) + "')";
		
		
		try {
			st.execute(query1);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
