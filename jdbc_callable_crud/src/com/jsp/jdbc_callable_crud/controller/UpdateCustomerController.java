package com.jsp.jdbc_callable_crud.controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class UpdateCustomerController {
	public static void main(String[] args) {
		//Step-1 Load/Register Driver
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

		
		//Step-2 Create Connection
		String url ="jdbc:mysql://localhost:3306/jdbc-a3";
		String username ="root";
		String password ="9305725765@#";
		
		Connection connection=DriverManager.getConnection(url, username, password);
		
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
