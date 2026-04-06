package com.bookapp.dao;

import java.util.List;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;

public interface IBookDao {

	List<Book> getAll();
	List<Book> getByAuthor(String author)throws BookNotFoundException;
	List<Book> getByLesserPrice(double price)throws BookNotFoundException;
	long getCount();
	Book getById(int bookId)throws BookNotFoundException;
	List<Book> getByCategoryAndLessPrice(String category,double price)throws BookNotFoundException;
	List<String> getBookTitles(String author); // projection
	
	List<Book> getByTitleContains(String choice)throws BookNotFoundException;
	//all the books where the published year is greater than the year given
	// 2022 - all books after year 2022
	List<Book> getByPublishedYear(int year)throws BookNotFoundException;
	List<Book> getByAuthorAndTitleContains(String choice)throws BookNotFoundException;
}
