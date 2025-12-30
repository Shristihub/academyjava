package com.util.listex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrListDemo {

	public static void main(String[] args) {
		
		List<String> mylist =  new ArrayList<>();
		System.out.println(mylist.size());
		mylist.add("Apple");
		mylist.add("Orange");
		mylist.add("Apple");
		mylist.add("10");
		mylist.add("kiwi");
		mylist.add("banana");
		System.out.println(mylist); //apple,orange,apple,10,kiwi,banana
		mylist.set(3,"papaya"); //replacing
		mylist.add(1, "strawberry"); //insertion
		System.out.println(mylist.size()); 
		System.out.println(mylist); //apple,strawberry,orange,apple,papaya,kiwi,banana
		System.out.println();
		System.out.println(mylist.get(4));
		
		System.out.println();
		for(String str :mylist) {
			System.out.println(str.toUpperCase());
		}
		
		List<String> fruits =  new ArrayList<>();
		fruits.add("MANGO");
		fruits.add("blueberry");
		fruits.add("100");
		fruits.addAll(mylist);
		fruits.add("guava");
		System.out.println(fruits);
		System.out.println();
		Collections.sort(fruits);
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		
		
	}

}










