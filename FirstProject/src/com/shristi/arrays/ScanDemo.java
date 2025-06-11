package com.shristi.arrays;

import java.util.Scanner;

public class ScanDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Details");
		System.out.println("enter name");
		String name = sc.nextLine();
		System.out.println("Name: "+name);
		System.out.println("enter empId");
		int empId = sc.nextInt();
		System.out.println("EmpId:"+empId);
		sc.nextLine();
		System.out.println("enter dept");
		String dept = sc.nextLine();
		System.out.println("Dept: "+dept);
		System.out.println("enter salary");
		double salary = sc.nextDouble();
		System.out.println("Salary: "+salary);
		sc.close();
	}

}
