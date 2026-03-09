package com.jdbc.prep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Arrays;

public class BatchPrepDemo {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/academyjava";
		String username="root";
		String password="root";
		String query = "insert into book values(?,?,?,?)";
		try(
			Connection connection = DriverManager.getConnection(url, username, password);
			PreparedStatement statement = connection.prepareStatement(query);
				){
			connection.setAutoCommit(false);//handle transaction
			//set values for parameters
			statement.setString(1, "HeadFirst Java");
			statement.setInt(2, 20);
			statement.setDouble(4, 800);
			statement.setString(3, "Kathy");
			//add this to addBatch() method
			statement.addBatch();
			
			statement.setString(1, "Java in Action");
			statement.setInt(2, 21);
			statement.setDouble(4, 1000);
			statement.setString(3, "Steve");
			statement.addBatch();
			
			statement.setString(1, "Html For Dummies");
			statement.setInt(2, 22);
			statement.setDouble(4, 850);
			statement.setString(3, "John");
			statement.addBatch();
			
			int[] result = statement.executeBatch();
			Arrays.stream(result).forEach(System.out::println);
			connection.setAutoCommit(true);
			
			
	}catch (Exception e) {
		e.printStackTrace();
	}
	}
}









