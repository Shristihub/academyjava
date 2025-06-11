package com.shristi.basics;

public class DatatypesDemo {

	public static void main(String[] args) {
		String username = "Priya";
		String message = "\"Welcome to Java\"";
		System.out.print("Have a great day\n");
		System.out.println(username+"\t"+message);
		
		int x=120;
		int y = 0120;
		int z = 0b1010;
		int a = 0x120;
		System.out.println(x+" "+y+" "+z+" "+a);
		System.out.println("Sum "+(x+y));
		
		System.out.println(" "+x+y+z+a);
		long v=1L;
		double num=24.5;
		float num1 = 24.5f;
		System.out.println(num+num1);
		
		
	}
}
