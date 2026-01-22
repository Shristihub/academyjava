package com.jdbc.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateDemo {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/academyjava";
		String username="root";
		String password="root";
		String query = 
				"""
				create table employee(emp_name varchar(20),emp_id int primary key,
				city varchar(20),salary float)
				
				""";
		Connection connection = null;
		Statement statement = null;
				
		try {
			//create a connection object
			connection = DriverManager.getConnection(url, username, password);
			//create a Statement 
			statement = connection.createStatement();
			//call execute() to execute the query
			boolean tableCreated = statement.execute(query);
			System.out.println("Table Created " + !tableCreated);
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}finally {
			try {
				if(statement!=null)
					statement.close();
				if(connection!=null)
					connection.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}












