package com.jdbc.prep;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class CallDemoInOut {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/academyjava";
		String username="root";
		String password="root";
		String sql = "{call addNumber(?)}";
		
		try(
			Connection connection = DriverManager.getConnection(url, username, password);
		    CallableStatement statement = connection.prepareCall(sql);
				){
			//assign values
			statement.setInt(1, 2000);
			//registerout for index 1
			statement.registerOutParameter(1, Types.INTEGER);
			boolean result = statement.execute();
			System.out.println("called procedure "+!result);
			
			//retrieve the output
			int num = statement.getInt(1);
			System.out.println(num);
	}catch (Exception e) {
		e.printStackTrace();
	}
	}
}









