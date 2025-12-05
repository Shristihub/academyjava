package com.excep.basics;

public class MultipleCatchDemo {

	public static void main(String[] args) {
		System.out.println("Welcome");
		try {
			String val = args[0]; // ArrayIndexOutOfBoundsException
			System.out.println("value got");
			int num = Integer.parseInt(val); // NumberFormatException
			System.out.println("Number " + num);
			int result = 100 / num; // ArithmeticException
			System.out.println("Result " + result);
			int [] marks = null;
			System.out.println(marks[0]); //NullPointerException
		} catch (ArithmeticException e) {
			System.err.println("Please enter a value greater than zero");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Please enter a value");
		} catch (NumberFormatException e) {
			System.err.println("Please enter a number");
		} catch (RuntimeException e) {
			System.out.println("...runtime exception");
		}  catch (Exception e) {
			System.err.println("...other  exception...");
		}
		System.out.println("work completed");
		System.out.println("goodbye");
	}
}
