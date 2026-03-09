package com.jdbc.prep;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class CallDemoOut {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/academyjava";
		String username="root";
		String password="root";
		String sql = "{call getTitlePrice(?,?,?) }";
		
		try(
			Connection connection = DriverManager.getConnection(url, username, password);
		    CallableStatement statement = connection.prepareCall(sql);
				){
			//pass values for placeholders
			statement.setInt(1, 51);
			statement.registerOutParameter(2, Types.VARCHAR);
			statement.registerOutParameter(3, Types.DOUBLE);
			boolean result = statement.execute();
			System.out.println("called procedure "+!result);
			
			// retrieve the output values
			String title =  statement.getString(2);
			double price = statement.getDouble(3);
			System.out.println("Title "+title);
			System.out.println("Price "+price);
	}catch (Exception e) {
		e.printStackTrace();
	}
	}
}









