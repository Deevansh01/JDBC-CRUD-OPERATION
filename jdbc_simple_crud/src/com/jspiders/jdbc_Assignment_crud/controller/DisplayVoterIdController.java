package com.jspiders.jdbc_Assignment_crud.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayVoterIdController {
	public static void main(String[] args) {
		Connection connection=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/jdbc-a3";
			String username = "root";
			String password = "9305725765@#";
			
			connection=DriverManager.getConnection(url, username, password);
			
			Statement statement=connection.createStatement();
			
			String DisplayVoterIdController = "Select * from voterid";
			ResultSet rs=statement.executeQuery(DisplayVoterIdController);
			while(rs.next()) {
			
			int id=rs.getInt("id");
			System.out.println("Id is: "+id);
			
			String name=rs.getString("name");
			System.out.println("Name is: "+name);
			
			String dob=rs.getString("dob");
			System.out.println("Date Of Birth is: "+dob);
			
			String address=rs.getString("address");
			System.out.println("Address is: "+address);
			
			String fatherName=rs.getString("fatherName");
			System.out.println("Father's Name is: "+fatherName);
			
			String gender=rs.getString("gender");
			System.out.println("Gender is: "+gender);
			System.out.println("===========================");
			}
		}
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				connection.close();
			} 
			catch (SQLException e)
			{
				
				e.printStackTrace();
			}
		}
		
		
	}

}
