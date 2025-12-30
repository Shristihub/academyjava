package com.util.listex;

import java.util.LinkedList;

public class LinkListDemo {

	public static void main(String[] args) {
		LinkedList<String> mylist =  new LinkedList<>();
		System.out.println(mylist.size());
		mylist.add("Apple");
		mylist.add(null);
//		mylist.add("Orange");
//		mylist.add("Apple");
		mylist.addFirst("grapes");
		mylist.addLast("strawberry");
		System.out.println(mylist);
//		mylist.add("kiwi");
//		mylist.add("banana");
		System.out.println(mylist); 
		System.out.println(mylist.get(1));
		
		
		for (String str : mylist) {
			System.out.println(str);
		}
		
		// use the method of Queue interface
		mylist.offerFirst("pineapple");
		System.out.println(mylist);
		//retrieves the element but does not remove
		System.out.println(mylist.element());
		System.out.println(mylist.peek());
		System.out.println();
		//retrieves the element and remove
		System.out.println(mylist.remove());
		System.out.println(mylist);
		System.out.println(mylist.poll());
		System.out.println(mylist);
		System.out.println(mylist.poll());
		System.out.println(mylist);
		System.out.println(mylist.poll()); //strawberry
		System.out.println(mylist);
		System.out.println(mylist.poll()); //returns null
		System.out.println(mylist.peek()); //returns null
//		System.out.println(mylist.remove());  //NoSuchElementException
		System.out.println(mylist.element());//NoSuchElementException
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
