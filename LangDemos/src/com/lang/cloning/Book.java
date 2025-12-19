package com.lang.cloning;

public class Book implements Cloneable{

	private String title;
	private int bookId;
	private Publisher publisher;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String title, int bookId, Publisher publisher) {
		super();
		this.title = title;
		this.bookId = bookId;
		this.publisher = publisher;
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
	public Publisher getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", bookId=" + bookId + ", publisher=" + publisher + "]";
	}
	
	
}
