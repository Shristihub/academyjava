package com.jdbc.prep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CreatePrepDemo {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/academyjava";
		String username="root";
		String password="root";
		String query = 
				"""
				create table book(title varchar(20),book_id int primary key,
				author varchar(20),price float)
				
				""";
		try(
			Connection connection = DriverManager.getConnection(url, username, password);
			PreparedStatement statement = connection.prepareStatement(query);
				){
			// call execute method
			boolean status = statement.execute();
			System.out.println("Table Created "+!status);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
