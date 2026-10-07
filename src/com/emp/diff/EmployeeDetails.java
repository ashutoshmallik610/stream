package com.emp.diff;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDetails {

	public List<Employee> getEmployees()
	{
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee(101,"Ashutosh", "IT", 75000)); //1

		list.add(new Employee(102,"Rahul", "HR", 45000)); //2

        list.add(new Employee(103,"Priya", "FINANCE", 55000)); //3

        // Duplicate of Employee 1
        list.add(new Employee(101, "Ashutosh", "IT", 50000)); //4

        list.add(new Employee(104, "Ravi", "HR", 70000)); //5

        list.add(new Employee(105, "Sneha", "FINANCE", 75000)); //6

        list.add(new Employee(106, "Amit", "HR", 65000)); //7

        // Duplicate of Employee 5
        list.add(new Employee(120, "Ravi", "HR", 70000)); //8
        
        list.add(new Employee(107,  "Neha", "IT", 40000)); //9

        list.add(new Employee(108, "Vikash", "FINANCE", 42000)); //10

        list.add(new Employee(109, "Pooja", "FINANCE", 43000)); //11

        // Duplicate of Employee 9
        list.add(new Employee(107, "Neha", "IT", 40000)); //12

        // More employees
        list.add(new Employee(110, "Karan", "HR", 48000)); //13

        list.add(new Employee(111, "Meena", "FINANCE", 68000)); //14

        // Duplicate of Employee 10
        list.add(new Employee(108, "Vikash", "FINANCE", 42000)); //15
        
        list.add(new Employee(108, "Asmit", "IT", 50000));
		
		return list;
	}
}
