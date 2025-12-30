package com.util.comp;

import java.util.Comparator;

public class CitySort implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		int citysort = o1.getCity().compareTo(o2.getCity());
		int salsort = Double.compare(o1.getSalary(), o2.getSalary());
		int namesort = o1.getEmployeeName().compareTo(o2.getEmployeeName());
		int idsort = Integer.compare(o1.getEmployeeId(), o2.getEmployeeId());

		// city is same
		if (citysort == 0) {
			// compare salary - salary is same
			if (salsort == 0) {
				// compare name
				if (namesort == 0) {
					// compare id
					return idsort; // follow checking id
				} else
					return namesort; // follow checking name
			} else
				return salsort; // follow checking salary
		} else
			return citysort;// follow checking city

	}

}
