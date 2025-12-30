package com.util.listex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class BookMain {

	public static void main(String[] args) {
		//create an ArrayList of type Book
		List<Book> books = new ArrayList<>();
		//create a book object
		Book book = new Book("Java", 10, "Kathy");
//		 and add to list
		books.add(book);
		books.add(new Book("5am",11,"Robin"));
		books.add(new Book("Habits",12,"Steve"));
		books.add(new Book("Spring",13,"John"));
		books.add(new Book("Html",14,"Gary"));
		books.add(new Book("Leadership",15,"Robin"));
		books.add(new Book("Monk",16,"Robin"));
		
		System.out.println(books);
		
		System.out.println("Using iterator");
		Iterator<Book> bookIt =  books.iterator();
		// check if the next element is available
		while(bookIt.hasNext()) {
			// if yes, get the element
			Book nbook = bookIt.next();
			System.out.println(nbook);
		}
		System.out.println();
		System.out.println("using ListIterator");
		// element at index 3 will be printed for hasNext
		// element at index 3 will NOT be printed for hasPrevious
		ListIterator<Book> bookListIt = books.listIterator(3);
		while(bookListIt.hasNext()) {
			Book nbook = bookListIt.next();
			System.out.println(nbook.getTitle());
		}
		
		System.out.println();
		System.out.println("Using forEach");
	    for (Book sbook : books) {
			System.out.println(sbook);
		}
	    
	    System.out.println("Getting books by author - Robin");
	    //create a temp list
	    List<Book> booksByAuthor = new ArrayList<Book>();
	    // iterate thru the list
	    for (Book abook : books) {
			// provide the condition
	    	if(abook.getAuthor().equals("Robin")) {
	    		//add the book to booksByAuthor - templist
	    		booksByAuthor.add(abook);
	    	}
		}
	    System.out.println();
	    //iterate thru booksByAuthor
	    for (Book newbook : booksByAuthor) {
			System.out.println(newbook);
		}
	    
		 
	}

}

















