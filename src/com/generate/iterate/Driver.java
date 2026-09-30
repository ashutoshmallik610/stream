package com.generate.iterate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Driver {

	public static void main(String[] args) {

		// Generate a stream of random numbers
		
		  Stream.generate(Math::random).limit(5) // Stop after 5 numbers so it doesn't run forever 
		  .forEach(System.out::println);
		  
		  System.out.println("----------------------------------");
		  
		  Stream.iterate(0, n -> n + 2).limit(5) // Grab the first 5 numbers
		  .forEach(System.out::println); // Prints: 0, 2, 4, 6, 8
		  
		  System.out.println("=========================");
		  
		  List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6);
		  
		  Integer s = l.stream().filter(x -> x % 2 != 0).reduce(0, (a, b) -> a + b);
		  
		  System.out.println(s);
		 

		/*
		 * // List<Integer> lll = Arrays.asList(1 , 2, 3, 4, 5); // // lll.set(0, 10);
		 * // // System.out.println(lll);
		 */

		/*
		 * List<Integer> l = List.of(1 , 2, 3, 4, 5);
		 * 
		 * l.set(0, 10);
		 * 
		 * System.out.println(l);
		 */
	}
}
