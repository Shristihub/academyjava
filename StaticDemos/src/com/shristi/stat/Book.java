package com.shristi.stat;

public class Book {
	static String libraryName;
	static int maxBooksAllowed;
	static {
		libraryName ="Just Books";
		maxBooksAllowed =4;
		System.out.println("in static block");
	}
	
	public Book() {
		System.out.println(" in constructor");
	}

	static void libraryDetails() {
		System.out.println("Name "+libraryName);
		System.out.println("Max Books Allowed "+maxBooksAllowed);
	}

	
}
