package com.jspider.jdbc_simple_crud.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateProductController {
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
				String updateProductColorQuery = "update product set color='red' where id=134";
				
				//This method will return 0 or 1
				int a=statement.executeUpdate(updateProductColorQuery);
				
				if(a==1)
				{
					System.out.println("Data Stored...");
				}else 
				{
					System.out.println("Given primary key not present in table");
				}
		
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
				System.out.println("Data not stored!......");
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
