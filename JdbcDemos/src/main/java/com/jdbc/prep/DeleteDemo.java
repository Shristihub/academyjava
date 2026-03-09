package com.jdbc.prep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteDemo {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/academyjava";
		String username = "root";
		String password = "root";
		String query = "delete from book where book_id =?";
		try (Connection connection = DriverManager.getConnection(url, username, password);
				PreparedStatement statement = connection.prepareStatement(query);
				Scanner sc = new Scanner(System.in);) {
			System.out.println("enter bookid");
			int bookId = sc.nextInt();
			statement.setInt(1, bookId);
			int deletedCount = statement.executeUpdate();
			System.out.println(deletedCount);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
