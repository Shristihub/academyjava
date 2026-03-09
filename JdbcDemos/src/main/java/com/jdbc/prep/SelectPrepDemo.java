package com.jdbc.prep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectPrepDemo {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/academyjava";
		String username="root";
		String password="root";
		String query = "select * from book";
		try(
			Connection connection = DriverManager.getConnection(url, username, password);
			PreparedStatement statement = connection.prepareStatement(query);
			ResultSet rs = statement.executeQuery();){
			while(rs.next()) {
				String title= rs.getString("title");
				int bookId =rs.getInt(2);
				String author= rs.getString("author");
				double price = rs.getDouble("price");
				//print the row
				System.out.println(title+"\t"+bookId+"\t"+author+"\t"+price);
			}
			System.out.println("completed");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
