package com.bookapp.client;

import java.util.List;

import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;

public class User {

	public static void main(String[] args) {
		IBookService bookService = new BookServiceImpl();
		List<Book> books =  bookService.getAll();
		for (Book book : books) {
			System.out.println(book);
		}
	}
}
