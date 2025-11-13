package com.shristi.stat;

public class Customer {

	public static void main(String[] args) {
		System.out.println("Customer borrowing....");
		//call using className.methodName
		Book.libraryDetails();
//		System.out.println(Book.libraryName);
		Book book = new Book();
//		Book.libraryDetails();
		System.out.println(Book.libraryName);
		int x = Integer.parseInt("100");
		System.out.println(x);
		
	}
}
