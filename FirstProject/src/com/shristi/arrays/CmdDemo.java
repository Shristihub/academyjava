package com.shristi.arrays;

public class CmdDemo {

	public static void main(String[] args) {
			System.out.println(args.length);
			
			for (String val : args) {
				System.out.println(val);
			}
			System.out.println();
			String name = args[0];
			System.out.println(name);
			//"20" -> 20  "priya"->NumberFormatException
			int empId = Integer.parseInt(args[1]);
			System.out.println(empId+10); //30
			System.out.println(args[1]+10); //2010
			
			String dept = args[2];
			System.out.println(dept);
			
			double salary = Double.parseDouble(args[3]);
			System.out.println(salary);
			
			
			
			
			
			
	}

}
