package com.excep.basics;

public class TryDemo {
	public static void main(String[] args) {
		System.out.println("Welcome");
		try {
			String val = args[0]; // ArrayIndexOutOfBoundsException
			System.out.println("value got");
			int num = Integer.parseInt(val); // NumberFormatException
			System.out.println("Number " + num);
			int result = 100 / num; // ArithmeticException
			System.out.println("Result " + result);
		} catch (Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		System.out.println("work completed");
		System.out.println("goodbye");
	}

}
