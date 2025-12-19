package com.lang.str;

public class StringDemo {

	public static void main(String[] args) {
		
		String s1="This is a demo";
		System.out.println(s1.charAt(5)); //5
		s1 = s1.concat("!!! Try this");
		System.out.println(s1);
		System.out.println(s1.contains("a"));
		System.out.println(s1.endsWith("s"));//true
		System.out.println(s1.startsWith("s"));//false
		
		String s2 ="hello";
		System.out.println(s2.equalsIgnoreCase("Hello"));//true
		System.out.println(s1.indexOf('i')); //2
		System.out.println(s1.indexOf('i',4));//5
		System.out.println(s1.indexOf("is",4)); //2
		
		String s3=" ";
		System.out.println(s3.isBlank()); // nocharacters - true
		System.out.println(s3.isEmpty()); // space available- false
		
		System.out.println(s1.lastIndexOf("is")); //24
		System.out.println(s1.length()); //26
		System.out.println(s1.substring(18));
		System.out.println(s1.substring(18,21));
		System.out.println(s2.substring(1,4));
		System.out.println("Have a Great day".substring(7));//Great
		System.out.println("Have a Great day".substring(7,12));//Great Day
		
		
		String str1 ="hello";
		String str2 ="hello";
		String str3 = new String("hello");
		String str4 = new String("hello");
		
		System.out.println();
		System.out.println("comparing references - ==");
		System.out.println(str1==str2);//true
		System.out.println(str1==str3);//false
		System.out.println(str3==str4);//false
		
		System.out.println();
		System.out.println("comparing literals - equals");
		System.out.println(str1.equals(str2));//true
		System.out.println(str1.equals(str3));//true
		System.out.println(str3.equals(str4));//true
		
		
	}
}














