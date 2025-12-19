package com.lang.str;

public class StringBuffDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hello");
		System.out.println(sb.length()); //5
		System.out.println(sb.capacity()); //5+16
		System.out.println(sb);
		
		System.out.println(sb.append('!'));
		System.out.println(sb.append("welcome"));
		System.out.println(sb.length()+" "+sb.capacity()); //(oldcapacity*2)+2
		
		System.out.println(sb.insert(5, " Sri"));
		char c = sb.charAt(7);
		System.out.println(c);
		
		System.out.println(sb.indexOf("o"));
		System.out.println(sb.indexOf("o", 9));
		System.out.println(sb.lastIndexOf("e"));
//		System.out.println(sb.reverse());
		System.out.println(sb.delete(10, 13));
		System.out.println(sb.substring(6));
		System.out.println(sb.substring(6,9));
		
	
	
	
	
	
	
	
	}
}
