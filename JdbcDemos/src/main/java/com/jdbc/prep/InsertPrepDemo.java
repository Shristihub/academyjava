package com.jdbc.prep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertPrepDemo {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/academyjava";
		String username="root";
		String password="root";
		String query = "insert into book values(?,?,?,?)";
		try(
			Connection connection = DriverManager.getConnection(url, username, password);
			PreparedStatement statement = connection.prepareStatement(query);
				){
			//assign values for placeholder
			statement.setString(1, "HeadFirst Java");
			statement.setInt(2, 10);
			statement.setDouble(4, 800);
			statement.setString(3, "Kathy");
			// call execute method
			boolean status = statement.execute();
			System.out.println("Values inserted "+!status);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
