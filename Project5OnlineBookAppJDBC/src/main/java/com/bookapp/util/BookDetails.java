package com.bookapp.util;

import java.util.Arrays;
import java.util.List;

import com.bookapp.model.Book;

public class BookDetails {
	
	public static List<Book> fetchBooks(){
		return Arrays.asList(
				new Book("HeadFirst Java",1,"Kathy",900,"Tech"),
				new Book("Spring in Action",2,"Rod",1450,"Tech"),
				new Book("5am club",3,"Robin",450,"Selfhelp"),
				new Book("Seven Habits",4,"Steve",900,"Selfhelp"),
				new Book("Leadership",5,"Robin",780,"Selfhelp"),
				new Book("Winter Foods",6,"Tara",1250,"Health")
				);
	}

}
