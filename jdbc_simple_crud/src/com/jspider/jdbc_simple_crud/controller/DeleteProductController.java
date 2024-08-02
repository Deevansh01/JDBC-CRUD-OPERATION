package com.jspider.jdbc_simple_crud.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteProductController {
	public static void main(String[] args) {
		Connection connection=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/jdbc-a3";
			String username="root";
			String password="9305725765@#";
			
			connection = DriverManager.getConnection(url,username,password);
			
			Statement statement=connection.createStatement();
			
			String DeleteProductController = "Delete from product where id=420";
			statement.execute(DeleteProductController);
			System.out.println("Data deletion done....");
			
			
		} catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}finally {
			try {
				connection.close();
				
			}catch(SQLException e){
				e.printStackTrace();
				
			}
		}
	}

}
