package com.inter.extend;

public interface IScientific extends ICalculator {
	// the other two methods are available implicitly
	void square(int x);
	void cube(int x);
}
