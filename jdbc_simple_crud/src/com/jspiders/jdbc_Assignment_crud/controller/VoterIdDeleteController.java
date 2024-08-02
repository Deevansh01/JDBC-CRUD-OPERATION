package com.jspiders.jdbc_Assignment_crud.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class VoterIdDeleteController {
	public static void main(String[] args) {
		Connection connection=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/jdbc-a3";
			String username = "root";
			String password = "9305725765@#";
			
			connection=DriverManager.getConnection(url, username, password);
			
			Statement statement=connection.createStatement();
			
			String DeleteVoterIdController="Delete from voterid where id=333";
			statement.execute(DeleteVoterIdController);
			
			System.out.println("Data Deleted....");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
