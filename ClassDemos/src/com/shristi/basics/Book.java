package com.shristi.basics;

public class Book {

	String title;
	String author;
	double price;
	
	void getDetails() {
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println("Price: "+price);
	}
	
	String printMessage() {
		return "Good Collection of books";
	}
	
	String showCollection(String category) {
		return "Collection of "+ category+ " books!!!";
	}
	
	
}
