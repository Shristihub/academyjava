package com.jdbc.prep;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CallDemo {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/academyjava";
		String username="root";
		String password="root";
		String sql = "{call insert_book(?,?,?,?) }";
		
		try(
			Connection connection = DriverManager.getConnection(url, username, password);
		    CallableStatement statement = connection.prepareCall(sql);
				){
		//pass values for placeholders
			statement.setString(1, "Many Masters");
			statement.setInt(2, 51);
			statement.setString(3, "Joe");
			statement.setDouble(4, 780);
			boolean result = statement.execute();
			System.out.println("called procedure "+!result);
	}catch (Exception e) {
		e.printStackTrace();
	}
	}
}









