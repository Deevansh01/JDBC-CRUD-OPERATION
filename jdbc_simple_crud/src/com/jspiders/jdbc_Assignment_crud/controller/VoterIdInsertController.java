package com.jspiders.jdbc_Assignment_crud.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class VoterIdInsertController {
	public static void main(String[] args) {
		
		try {
			//Step-1 Load/Register Driver.
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Step-2 Create Connection
			
			String url = "jdbc:mysql://localhost:3306/jdbc-a3";
			String username = "root";
			String password = "9305725765@#";
			
			Connection connection = DriverManager.getConnection(url, username, password);
			
			//Step-3 Create Statement
			
			Statement statement = connection.createStatement();
			
			//Step-4 Execute query
			
			String insertQuery = "insert into voterid(id,name,dob,address,fatherName,gender) values(332,'Mohan','2000-08-13','Sector-19 Noida','Mr.Ram Singh','male')";
			String insertQuery1 = "insert into voterid(id,name,dob,address,fatherName,gender) values(234,'Rohan','1998-04-23','Sector-49 Noida','Harish Rajput','male')";
			String insertQuery2 = "insert into voterid(id,name,dob,address,fatherName,gender) values(567,'Sunaina','2000-12-21','Sector-62 Noida','Mr.Raj Sharma','female')";
			String insertQuery3 = "insert into voterid(id,name,dob,address,fatherName,gender) values(111,'ManMohan','1995-03-15','Sector-03 Noida','Mr. Suresh Kumar','male')";
			String insertQuery4 = "insert into voterid(id,name,dob,address,fatherName,gender) values(676,'Preeti','1990-10-08','Sector-20 Noida','Mr. Rajesh Tiwari','female')";
			statement.execute(insertQuery);
			statement.execute(insertQuery1);
			statement.execute(insertQuery2);
			statement.execute(insertQuery3);
			statement.execute(insertQuery4);
						
			System.out.println("Data Stored....");
			
		}
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
	}

}
