package com.inter.anony;

public class AnonyMain {

	public static void main(String[] args) {
		//class that implements the interface
		IGreeter greeter = new Employee();
		greeter.greetUser("Sri");
		
		// using anonymous inner class
		//providing the implementation
		IGreeter ref = new IGreeter() {
			@Override
			public void greetUser(String username) {
				System.out.println("Hello "+username);
				call();
			}
			// own method of anonymous inner class
			private void call() {
				System.out.println("calling");
			}
		};
		System.out.println("inside main");
		ref.greetUser("Priya");
		
		
	}
}
