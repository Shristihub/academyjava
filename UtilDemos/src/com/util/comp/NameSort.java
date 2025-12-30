package com.util.comp;

import java.util.Comparator;

public class NameSort implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o2.getEmployeeName().compareTo(o1.getEmployeeName());
	}

}
