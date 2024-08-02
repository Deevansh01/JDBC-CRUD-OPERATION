package com.jspider.jdbc_simple_crud.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductInsertController {
	public static void main(String[] args) {
		
		//step-1 load/register Driver {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step-2 create Connection
			String url ="jdbc:mysql://localhost:3306/jdbc-a3";
			String username ="root";
			String password ="9305725765@#";
			
			Connection connection=DriverManager.getConnection(url, username, password);
			
			//Step-3 create statement
			Statement statement=connection.createStatement();
			
			//Step-4 execute query
			String insertQuery = "insert into product(id,name,color,price) values(101,'T-Shirt','Navy Blue','550.0')";
			statement.execute(insertQuery);
			
			System.out.println("DATA Stored....");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.out.println("Data not stored!......");
		}
		
		
	}

}
