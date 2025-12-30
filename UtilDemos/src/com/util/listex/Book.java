package com.util.listex;

public class Book {
	private String title;
	private int bookId;
	private String author;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String title, int bookId, String author) {
		super();
		this.title = title;
		this.bookId = bookId;
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", bookId=" + bookId + ", author=" + author + "]";
	}
	
	
	
	

}
