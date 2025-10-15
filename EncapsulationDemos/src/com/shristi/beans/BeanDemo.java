package com.shristi.beans;

public class BeanDemo {

	public static void main(String[] args) {
		Book book = new Book();
		book.setTitle("Java in Action");
		book.setBookId(10);
		book.setPrice(1200.0);
		
		String title=book.getTitle();
		System.out.println(title);
		System.out.println(book.getBookId());
		double price = book.getPrice();
		System.out.println(price);
		System.out.println(book);
		
		
		Product product = new Product();
		product.setProductName("Mobile");
		product.setBrand("Samsung");
		product.setProductId(1);
		product.setPrice(20000);
		
		
		System.out.println(product);
		
	}

}




