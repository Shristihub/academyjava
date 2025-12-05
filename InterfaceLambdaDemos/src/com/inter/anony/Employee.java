package com.inter.anony;

public class Employee implements IGreeter{

	@Override
	public void greetUser(String username) {
		System.out.println("Welcome "+username);
	}

	

	
}
