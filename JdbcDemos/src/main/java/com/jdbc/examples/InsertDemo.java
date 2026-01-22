package com.jdbc.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertDemo {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/academyjava";
		String username = "root";
		String password = "root";
		String query = "insert into employee values('Priya',1,'Bengaluru',2000)";

		try (Connection connection = DriverManager.getConnection(url, username, password);
			 Statement statement = connection.createStatement();
			 Scanner sc = new Scanner(System.in);	
				) {
			
			for (int i = 0; i < 4; i++) {
				System.out.println("Enter name");
				String empName = sc.next();
				System.out.println("Enter id");
				int empId = sc.nextInt();
				System.out.println("Enter salary");
				double salary = sc.nextDouble();
				System.out.println("Enter city");
				String city= sc.next();
				query = "insert into employee values('"+empName+"',"+empId+",'"+city+"',"+salary+")";
				// call execute() to execute the query
				boolean rowInserted = statement.execute(query);
				System.out.println("Record Added " + !rowInserted);
			}
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

}
