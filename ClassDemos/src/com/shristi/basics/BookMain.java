package com.shristi.basics;

public class BookMain {

	public static void main(String[] args) {
		
		Book book1 = new Book();
		book1.title="Java in Action";
		book1.author = "Kathy";
		book1.price = 800;
//		System.out.println(book1.title+"\t"+book1.author+"\t"+book1.price);
		
		book1.getDetails();
		String message = book1.printMessage();
		System.out.println(message);
		String result = book1.showCollection("selfhelp");
		System.out.println(result);
		System.out.println();
		Book book2 = new Book();
		book2.title="Leadership";
		book2.author = "Robin";
		book2.price = 1200;
//		System.out.println(book2.title+"\t"+book2.author+"\t"+book2.price);
		
		book2.getDetails();
		System.out.println(book2.printMessage());
		System.out.println(book2.showCollection("tech"));
	}

}
