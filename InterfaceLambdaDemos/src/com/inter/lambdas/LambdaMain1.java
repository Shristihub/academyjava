package com.inter.lambdas;

public class LambdaMain1 {

	public static void main(String[] args) {
		IGreetings ref = user->System.out.println("welcome "+user);
		//call
		ref.greetUser("Sri");
		
		ICourse courseref = ()->{
			return new String[] {"java","spring","jenkins"};
		};
		for (String course : courseref.showCourses()) {
			System.out.println(course);
		}
	}
}
