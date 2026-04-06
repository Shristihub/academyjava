package com.bookapp.service;

import java.util.List;
import java.util.stream.Collectors;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;

public class BookServiceImpl implements IBookService{

	@Override
	public List<Book> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getByAuthor(String author) throws BookNotFoundException {
		// TODO Auto-generated method stub
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

	@Override
	public List<Book> getByTitleContains(String choice) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getByPublishedYear(int year) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getByAuthorAndTitleContains(String choice) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}



}
