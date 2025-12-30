package com.util.listex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {

	public static void main(String[] args) {

		List<String> mylist =  new ArrayList<>();
		mylist.add("Apple");
		mylist.add("Orange");
		mylist.add("Apple");
		mylist.add("10");
		mylist.add("kiwi");
		mylist.add("banana");
		mylist.add("papaya"); 
		mylist.add("strawberry"); 
		
		
		//call the method of List interface
		Iterator<String> it =  mylist.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s.toUpperCase());
		}
		System.out.println();
		Collections.sort(mylist);
		System.out.println("Reversing the list");
		// use list iterator  - backward access
		ListIterator<String>  listIt = mylist.listIterator(mylist.size());
	    while(listIt.hasPrevious()) {
	    	String val =  listIt.previous();
	    	System.out.println(val.toLowerCase());
	    }
	}

}
















