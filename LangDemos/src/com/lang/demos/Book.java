package com.lang.demos;

public class Book {
	private String title;
	private double price;
	private String author;
	private int bookId;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String title, double price, String author, int bookId) {
		super();
		this.title = title;
		this.price = price;
		this.author = author;
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + ", author=" + author + "]";
	}
	
	

}
