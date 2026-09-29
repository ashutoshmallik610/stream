package com.employee.salry;

import java.util.List;
import java.util.stream.Collectors;

public class Driver {

	public static void main(String[] args) {


		EmployeeDetails employeeDetails = new EmployeeDetails();
		
		List<Employee> emp = employeeDetails.getDetails();
		
		List<String> result = emp.stream().filter(x -> x.getSalary() > 50000).map(x -> x.getName())
				.collect(Collectors.toList());
		
		System.out.println(result);

	}

}
