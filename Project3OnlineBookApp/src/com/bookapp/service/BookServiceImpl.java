package com.bookapp.service;

import java.util.List;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;

public class BookServiceImpl implements IBookService{

	@Override
	public List<Book> getAll() {
		List<Book> books = BookDetails.fetchBooks();
		return books;
	}

	@Override
	public List<Book> getByAuthor(String author) throws BookNotFoundException {
		List<Book> books = BookDetails.fetchBooks();
		// temporary list - booksbyAuthor
		//iterate through the existing list
		//check if author name is same asthat of the parameter
		//book.getAuthor().equals(author)
		//add the book to the temp list
		//check if temp list is empty, if yes throw exception
		// return the temp list
		return null;
	}

	@Override
	public List<Book> getByLesserPrice(double price) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Book getById(int bookId) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getByCategoryAndLessPrice(String category, double price) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getBookTitles(String author) {
		// TODO Auto-generated method stub
		return null;
	}

}
