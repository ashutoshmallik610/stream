package com.employee.salry;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDetails {

	public List<Employee> getDetails()
	{
		List<Employee> l = new ArrayList<Employee>();
		
		l.add(new Employee("Hemant", 100000));
		
		l.add(new Employee("Abhi", 50000));
		
		l.add(new Employee("Ayush", 10000));
		
		l.add(new Employee("ashu", 60000));
		
		return l;
	}
}
