package com.shristi.stat;

public class Demo {

	static int x=10;
	static int y;
	static String message;
	static {
		System.out.println("in static block 1");
		y=20;
	}
	static {
		System.out.println("in static block 2");
		message="Have a great day";
	}
	static void printMessage() {
		System.out.println(message.toUpperCase());
	}
	public static void main(String[] args) {
		System.out.println("in main");
		// call static method directly from another static method
		//within the same class
		printMessage();
		System.out.println("Sum "+(x+y));
	}
}










