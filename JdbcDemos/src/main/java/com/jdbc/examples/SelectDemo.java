package com.jdbc.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectDemo {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/academyjava";
		String username = "root";
		String password = "root";
		String query = "select * from employee";

		try (Connection connection = DriverManager.getConnection(url, username, password);
			 Statement statement = connection.createStatement();
			 ResultSet rs = statement.executeQuery(query);){
			//iterate thru the resultset
			while(rs.next()) {
				String empName = rs.getString(1);
				int empId = rs.getInt("emp_id");
				String city=rs.getString("city");
				double salary = rs.getDouble("salary");
				System.out.println(empName+"\t"+empId+"\t"+city+"\t"+salary);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}













