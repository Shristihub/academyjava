package com.excep.advanced;

class B {
	static void m1() throws Exception{
		System.out.println("In B");
//		try {
			C.m2();
			System.out.println("work done");
//		} catch (Exception e) {
//			System.out.println("error...");
//		}
		System.out.println("m1 completed");
	}
}

class C {
	static void m2() throws Exception {
		System.out.println("In C");
		D.m3();
		System.out.println("m2 completed");
	}
}

class D {
	static void m3() throws Exception {
		System.out.println("In D");
		int num=100;
		if (num>10)
			throw new Exception("num is greater than 10.....");
		System.out.println("Work done");
	}
}

public class ExceptionChaining {

	public static void main(String[] args) {
		System.out.println("in main");
		try {
			B.m1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("goodbye");
	}
}
