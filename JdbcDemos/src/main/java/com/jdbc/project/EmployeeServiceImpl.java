package com.jdbc.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements IEmployeeService {
	static Connection connection;

	static {
		String url = "jdbc:mysql://localhost:3306/academyjava";
		String username = "root";
		String password = "root";
		try {
			connection = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addEmployee(Employee employee) {
		String sql = "insert into employee values(?,?,?,?)";
		try (PreparedStatement statement = connection.prepareStatement(sql);) {
			// assign values for placeholders of columns
			statement.setString(1, employee.getEmployeeName());
			statement.setInt(2, employee.getEmployeeId());
			statement.setDouble(4, employee.getSalary());
			statement.setString(3, employee.getCity());
			// call execute method
			boolean status = statement.execute();
			System.out.println("Inserted " + !status);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<Employee> getAllEmployees() {
		// create a List<Employee>
		List<Employee> employees = new ArrayList<Employee>();

		String sql = "select * from employee";
		try (PreparedStatement statement = connection.prepareStatement(sql); 
				ResultSet rs = statement.executeQuery();) {

			// iterate thru the resulset
			while (rs.next()) {
				String empName = rs.getString("emp_name");
				String city = rs.getString("city");
//				int empId = rs.getInt("emp_Id");
//				double salary = rs.getDouble("salary");
				// create employee object and set values
				Employee employee = new Employee();
				// use setter methods
				employee.setEmployeeName(empName);
				employee.setCity(city);
				employee.setEmployeeId(rs.getInt("emp_id"));
				employee.setSalary(rs.getDouble("salary"));

				// add employee object to the list
				employees.add(employee);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return employees;
	}

}
