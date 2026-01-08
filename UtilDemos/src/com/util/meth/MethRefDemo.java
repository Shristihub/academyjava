package com.util.meth;

import java.util.function.Consumer;

public class MethRefDemo {

	public static void main(String[] args) {
		//implementation
		ICalculator calc1 = (x,y)->System.out.println("Sum "+(x+y));
		//calling the method
		calc1.calculate(10, 20);
		
		//referring to a static method of another class
		ICalculator calc = Arithmetic::findSum;
		//calling the method
		calc.calculate(10, 20);
		
		Arithmetic arith = new Arithmetic();
		//referring to a instance method of another class
//		ICalculator pcalc = arith::findProduct;
		ICalculator pcalc = new Arithmetic()::findProduct;
		pcalc.calculate(20, 20);
		
		Consumer<String> con = System.out::println;
		con.accept("hello");
	}
}










