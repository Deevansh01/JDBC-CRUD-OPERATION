package com.jspider.jdbc_simple_crud.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectProductController {
	public static void main(String[] args) {
		Connection connection=null;
		//step-1 load/register Driver {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step-2 create Connection
			String url ="jdbc:mysql://localhost:3306/jdbc-a3";
			String username ="root";
			String password ="9305725765@#";
			
		    connection=DriverManager.getConnection(url, username, password);
			
			//Step-3 create statement
			Statement statement=connection.createStatement();
			
			//Step-4 execute query
			String selectProductQuery = "Select * from product";
			
			ResultSet rs=statement.executeQuery(selectProductQuery);
			while(rs.next()) {
			
			int id = rs.getInt("id");
			System.out.println(id);
			
		    String name = rs.getString("name");
		    System.out.println(name);
		    
		    String color = rs.getString("color");
		    System.out.println(color);
		    
		    double price = rs.getDouble("price");
		    System.out.println(price);
		    System.out.println("==========================");
    		}
	
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
			connection.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		
	}

}
