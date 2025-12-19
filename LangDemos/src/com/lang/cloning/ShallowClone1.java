package com.lang.cloning;

public class ShallowClone1 {

	public static void main(String[] args) {
		Publisher publisher = new Publisher(1,"Penguin Publishers");
		Book book = new Book("Java in action", 10, publisher);
		try {
			Book clonedBook =(Book) book.clone();
			System.out.println("book "+book);
			System.out.println("Cloned "+clonedBook);
			System.out.println();
			
			book.setTitle("Spring in Action");
			publisher.setPublisherName("Oxford Publishers");
			book.setPublisher(publisher);
			
			System.out.println("BookTitle: "+book.getTitle()); //spring
			System.out.println("ClonedBookTitle: "+clonedBook.getTitle()); //java
			
			System.out.println();
			System.out.println("bookpublisher "+book.getPublisher()); //oxford
			System.out.println("clonedbookpublisher "+clonedBook.getPublisher()); //oxford
			
			
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
