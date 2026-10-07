package com.emp.diff;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProcessEmployees {

	EmployeeDetails emp = new EmployeeDetails();

	/*
	 * 1. Consider only employees whose salary is *greater than 40,000*. 2. Group
	 * the employees by department. 3. For each department:
	 * 
	 * Extract employee names. Convert names to uppercase. Remove duplicate names.
	 * Sort names by *length in descending order*. If two names have the same
	 * length, sort them *alphabetically*. Skip the first name. Take at most *2
	 * names*. 4. Print the result in this format:
	 * 
	 * text IT → [RAHUL, AMIT] HR → [PRIYA, SNEHA] FINANCE → [ROHIT, AMAN]
	 */
	public void processAll() {
		List<Employee> emps = emp.getEmployees();

		Map<String, List<Object>> result = emps.stream().filter(x -> x.getSalary() > 40000).collect(
				Collectors.groupingBy(x -> x.getDept(), Collectors.collectingAndThen(Collectors.toList(), x -> x
						.stream().map(y -> y.getName().toUpperCase()).distinct()
						.sorted(Comparator.comparingInt(String::length).reversed().thenComparing(String::compareTo))
						.skip(1).limit(2).collect(Collectors.toList()))));

		System.out.println(result);

	}

	// Find second highest salary
	public void findSecondHighestSalary() {
		List<Employee> emps = emp.getEmployees();

		System.out.println();

//		Employee r = emps.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst()
//				.get();
//
//		System.out.println(
//				"Second Highest Salary employee Name is : " + r.getName() + " and Salary is : " + r.getSalary());

		Integer secondHighestSalary = emps.stream().map(Employee::getSalary).distinct()
				.sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);

		System.out.println();

		System.out.println("Second Highest salary if duplicate is present : " + secondHighestSalary);

//		emps.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
//				.collect(Collectors.toMap(Employee::getSalary, a -> a, (x, y) -> y, LinkedHashMap::new)).values()
//				.stream().skip(1).findFirst().get();

		Set<Integer>unique = new HashSet<Integer>();
		Employee result1 = emps.stream().filter(x -> unique.add(x.getSalary()))
				.sorted((a,b)->b.getSalary()-a.getSalary()).skip(1).findFirst().get();
		
		System.out.println(result1);

//		Optional<Integer> result = emps.stream().map(Employee::getSalary).distinct().sorted(Comparator.reverseOrder())
//				.skip(1).findFirst();
//
//		if (result.isPresent()) {
//			Optional<Employee> rrr = emps.stream().filter(emp -> emp.getSalary() == result.get()).findFirst();
//
//			rrr.ifPresent(emp -> System.out.println("Employee: " + emp));
//		} else {
//			System.out.println("No second highest salary found.");
//		}

	}

	// Find second highest salary from each dept
	public void findSecondHighestSalaryEachDept() {
		List<Employee> emps = emp.getEmployees();

		System.out.println();

		Map<Object, Object> r = emps.stream()
				.collect(Collectors.groupingBy(x -> x.getDept(),
						Collectors.collectingAndThen(Collectors.toList(),
								y -> y.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1)
										.findFirst().get())));

		r.forEach((key, value) -> System.out.println(key + " -> " + value));

	}

	// Find employees whose salary is greater than the average salary.
	public void salaryGrThenAverageSalary() {
		List<Employee> emps = emp.getEmployees();

		System.out.println();

		List<Employee> highEarners = emps.stream()
				.collect(Collectors.teeing(Collectors.toList(), Collectors.averagingInt(Employee::getSalary),
						(employeeList, averageSalary) -> employeeList.stream()
								.filter(x -> x.getSalary() > averageSalary).collect(Collectors.toList())));

		highEarners.forEach(e -> System.out.println(e.getName() + " -> " + e.getSalary()));

	}

	// Find employee with longest name
	public void longestNameEmployee() {
		List<Employee> emps = emp.getEmployees();

		Employee name = emps.stream().max(Comparator.comparingInt(emp -> emp.getName().length())).get();

		System.out.println("Longest employee name : " + name);
	}

	// Sort Employees by salary in desc order
	public void sortEmployeesBySalaryDesc() {
		List<Employee> emps = emp.getEmployees();

		emps.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(x -> System.out.println(x));

//		System.out.println("Longest employee name : " + e);
	}

	// sort employees 1st by dept and then salary
	public void sortByDeptAndThenSalary() {
		List<Employee> emps = emp.getEmployees();

		emps.stream().sorted(Comparator.comparing(Employee::getDept).thenComparingInt(Employee::getSalary))
				.forEach(x -> System.out.println(x));
	}

	// find employees whose name starts with "A" and salary is gr than 50k
	public void nameWithASalaryGr50k() {
		List<Employee> emps = emp.getEmployees();

		emps.stream().filter(x -> x.getName().startsWith("A") && x.getSalary() > 50000)
				.forEach(y -> System.out.println(y));
	}

	// Get only unique depts
	public void getOnlyUniqueDepts() {
		List<Employee> emps = emp.getEmployees();

		Set<String> set = new LinkedHashSet<String>();

		emps.stream().map(Employee::getDept).filter(x -> set.add(x)).forEach(y -> System.out.println(y));
	}

	// Find the top 3 highest-paid employees.
	public void top3HsPaidEmployee() {
		List<Employee> emps = emp.getEmployees();

		emps.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(3)
				.forEach(x -> System.out.println(x));
	}
}
