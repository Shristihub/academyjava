package com.jdbc.prep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateDemo {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/academyjava";
		String username="root";
		String password="root";
		String query = "update book set price=? where book_id>?";
		try(
			Connection connection = DriverManager.getConnection(url, username, password);
			PreparedStatement statement = connection.prepareStatement(query);
			Scanner sc = new Scanner(System.in);
				){
			System.out.println("enter price");
			double price = sc.nextDouble();
			statement.setDouble(1, price);
			System.out.println("enter bookid");
			int bookId = sc.nextInt();
			statement.setInt(2, bookId);
			int updatedCount = statement.executeUpdate();
			System.out.println(updatedCount);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	