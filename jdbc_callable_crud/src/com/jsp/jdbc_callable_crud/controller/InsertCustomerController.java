package com.jsp.jdbc_callable_crud.controller;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertCustomerController {
	public static void main(String[] args) {
		//Step-1 Load/Register Driver
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");

			
			//Step-2 Create Connection
			String url ="jdbc:mysql://localhost:3306/jdbc-a3";
			String username ="root";
			String password ="9305725765@#";
			
			Connection connection=DriverManager.getConnection(url, username, password);
			
			CallableStatement callableStatement= connection.prepareCall("call insertCustomer(?,?,?,?)");
			
			callableStatement.setInt(1, 1000);
			callableStatement.setString(2,"Deevansh");
			callableStatement.setString(3, "katare8808@gmail.com");
			callableStatement.setLong(4, 9305725765l);
			
			callableStatement.execute();
			System.out.println("Data inserted Successfully");
			}
			catch (Exception e ) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
