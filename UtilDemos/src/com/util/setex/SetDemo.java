package com.util.setex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> myset = new HashSet<>();
		myset.add("Arun");
		myset.add("Priya");
		myset.add("Sri");
		myset.add("Raj");
		myset.add("Zeena");
		myset.add("Sri");
		myset.add(null);
		myset.add("100");
		System.out.println(myset);
		
		for (String str : myset) {
			System.out.println(str);
		}
		
		System.out.println();
		myset = new LinkedHashSet<>();
		myset.add("Arun");
		myset.add("Priya");
		myset.add("Sri");
		myset.add("Raj");
		myset.add("Zeena");
		myset.add("Sri");
		myset.add(null);
		myset.add("100");
		System.out.println(myset);
		
		Iterator<String> it = myset.iterator();
		while (it.hasNext()) {
			String name =  it.next();
			System.out.println(name);
		}
		System.out.println();
		myset = new TreeSet<>();
		myset.add("Arun");
		myset.add("ARUN");
		myset.add("Priya");
		myset.add("Sri");
		myset.add("Raj");
		myset.add("Zeena");
		myset.add("sri");
//		myset.add(null);
		myset.add("100");
		System.out.println(myset);
		
		it = myset.iterator();
		while (it.hasNext()) {
			String name =  it.next();
			System.out.println(name);
		}
		
	}
}







