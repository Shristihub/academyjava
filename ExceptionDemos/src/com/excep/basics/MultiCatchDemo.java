package com.excep.basics;

public class MultiCatchDemo {

	public static void main(String[] args) {
		System.out.println("Welcome");
		try {
			String val = args[0]; // ArrayIndexOutOfBoundsException
			System.out.println("value got");
			int num = Integer.parseInt(val); // NumberFormatException
			System.out.println("Number " + num);
			int result = 100 / num; // ArithmeticException
			System.out.println("Result " + result);
			int[] marks = null;
			System.out.println(marks[0]); // NullPointerException
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException 
				| NumberFormatException e) {
			System.out.print("Please enter a number greater than zero");
			System.out.println(":  "+e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("the array is not initialized");
		} catch (Exception e) {
			System.out.println("...other... exception");
		}

		System.out.println("work completed");
		System.out.println("goodbye");
	}
}
