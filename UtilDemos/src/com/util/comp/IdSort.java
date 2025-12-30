package com.util.comp;

import java.util.Comparator;

public class IdSort implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return Integer.compare(o1.getEmployeeId(), o2.getEmployeeId());
	}

}
