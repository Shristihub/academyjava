package com.oops.inher2;

public class SuperDemo {

	public static void main(String[] args) {
		InEmployee inEmployee =  new InEmployee("Sri",10);
		inEmployee.getDetails();
		
		InManager manager = new InManager("Priya", 12, 2000);
		manager.getDetails();
		manager.calcBonus(2000);
	}
}
