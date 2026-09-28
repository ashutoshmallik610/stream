package com.sumGr50Num;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Driver {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Alice", "Bob", "Anna", "Charlie", "Alex");

		// Keeps names that do NOT start with "A"
	    List<String> filteredNames = names.stream().filter(name -> !name.startsWith("A")).collect(Collectors.toList());

	    System.out.println(filteredNames);
		

		List<Integer> l = new ArrayList<Integer>(Arrays.asList(10, 50, 20, 60, 90, 15, 40, 80, 13));
		
		//sum of numbers Gr than 50
		int sumOfLargeNumber = l.stream().filter(x -> x > 50).reduce(0, (a, b) -> a + b);
		
		System.out.println(sumOfLargeNumber);
		
		//max elemenst
		int maximun = l.stream().max((a, b) -> b.compareTo(a)).get();
		
		System.out.println(maximun);
		
		//min elemenst
		int minimum = l.stream().min((a, b) -> a.compareTo(b)).get();
		
		System.out.println(minimum);
		
		//count numbers divisible by 3
		long divBy3 = l.stream().filter(x -> x % 3 == 0).count();
				
		System.out.println(divBy3);
		
		//square of odd numbers
		List<Integer> sqrOdd = l.stream().filter(x -> x % 2 != 0).map(a -> a * a).toList();
						
		System.out.println(sqrOdd);
		
		
		List<Integer> numbers = Arrays.asList(10, 20, 10, 30, 20, 40, 50, 30);
		
		//find the second highest number
		Optional<Integer> secondHighest = numbers.stream().distinct().sorted((a, b) -> b.compareTo(a)).skip(1).findFirst();
		
		System.out.println(secondHighest);
		
		
		
	}

}
