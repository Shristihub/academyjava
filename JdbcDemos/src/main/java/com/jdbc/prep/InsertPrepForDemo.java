package com.jdbc.prep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertPrepForDemo {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/academyjava";
		String username = "root";
		String password = "root";
		String query = "insert into book values(?,?,?,?)";
		try (Connection connection = DriverManager.getConnection(url, username, password);
				PreparedStatement statement = connection.prepareStatement(query);
				Scanner sc = new Scanner(System.in);) {
			for (int i = 0; i < 4; i++) {
				// get value and assign values for placeholder
				System.out.println("Enter title");
//				String title = sc.next();
				statement.setString(1, sc.next());

				System.out.println("Enter id");
				int bookId = sc.nextInt();
				statement.setInt(2, bookId);

				System.out.println("Enter price");
				statement.setDouble(4, sc.nextDouble());

				System.out.println("Enter author");
				statement.setString(3, sc.next());
				// call execute method
				boolean status = statement.execute();
				System.out.println("Values inserted " + !status);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
