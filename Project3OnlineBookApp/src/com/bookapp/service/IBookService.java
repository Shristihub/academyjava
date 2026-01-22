package com.bookapp.service;

import java.util.List;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;

public interface IBookService {

	List<Book> getAll();
	List<Book> getByAuthor(String author)throws BookNotFoundException;
	List<Book> getByLesserPrice(double price)throws BookNotFoundException;
	long getCount();
	Book getById(int bookId)throws BookNotFoundException;
	List<Book> getByCategoryAndLessPrice(String category,double price)throws BookNotFoundException;
	List<String> getBookTitles(String author);
	
	
	
}
