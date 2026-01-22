package com.bookapp.service;

import java.util.List;
import java.util.stream.Collectors;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;

public class BookServiceImpl implements IBookService{

	@Override
	public List<Book> getAll() {
		List<Book> books = BookDetails.fetchBooks();
		// convert to stream , sort by title and return the data
		return books;
	}

	@Override
	public List<Book> getByAuthor(String author) throws BookNotFoundException {
		List<Book> books = BookDetails.fetchBooks();
		// convert books into a stream, call filter method
		//check if author name is same as that of the parameter
		//book.getAuthor().equals(author)
		//call collect method to return the new list - 
		// get it in a variable -  List<Book> booksByAuthor
		//check if  list is empty, if yes throw exception
		// return the temp list
		return null;
	}

	@Override
	public List<Book> getByLesserPrice(double price) throws BookNotFoundException {
		List<Book> books = BookDetails.fetchBooks();
		List<Book> booksByLesserPrice =  books.stream()
		     .filter(book->book.getPrice()<price)
//		     .sorted(null) //use the overloaded method
		     .collect(Collectors.toList());
		if(booksByLesserPrice.isEmpty())
			throw new BookNotFoundException("book less than this price not available");
		return booksByLesserPrice;
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
