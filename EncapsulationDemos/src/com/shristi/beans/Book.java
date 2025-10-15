package com.shristi.beans;

public class Book {

	private String title;
	private int bookId;
	private double price;
	
	//setter method
	public void setTitle(String title) {
		this.title = title;
	}
	public void setBookId(int id) {
		this.bookId =id;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	//getter method
	public String getTitle() {
		return title;
	}
	public int getBookId() {
		return bookId;
	}
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", bookId=" + bookId + ", price=" + price + "]";
	}
	
}




