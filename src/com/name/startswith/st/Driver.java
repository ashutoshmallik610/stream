package com.name.startswith.st;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver {

	public static void main(String[] args) {

		// Storing the data
		List<String> cities = Arrays.asList("Bangalore", "Chennai", "Hyderabad", "Ahmedabad", "Ajmer");

		// processing the task -----> name starts with "A"
		/*
		 * //1. convert the collection to a stream object Stream<String> inputStream =
		 * cities.stream();
		 * 
		 * //2. find the names starts with "A" Stream<String> filteredStream =
		 * inputStream.filter(w -> w.startsWith("A"));
		 * 
		 * //3. collect or print the city name List<String> result =
		 * filteredStream.collect(Collectors.toList());
		 * 
		 * System.out.println(result);
		 */

		List<String> nameStartsWithA = cities.stream().filter(x -> x.startsWith("A")).collect(Collectors.toList());

		System.out.println("City names starts with A				: " + nameStartsWithA);

		List<String> toUperrCase = cities.stream().filter(x -> x.startsWith("A")).map(w -> w.toUpperCase())
				.collect(Collectors.toList());

		System.out.println("Covert to upper case those cities starts with A	: " + toUperrCase);
		
		
		//multi-dimentional array
		List<List<String>> city = Arrays.asList(Arrays.asList("Bangalore", "Chennai"), Arrays.asList("Hyderabad", "Ahmedabad", "Ajmer"), Arrays.asList("Delhi"));
		
		System.out.println("Before using flatmap	: "+city);
		
		// flatmap ----> converts multi-dimentional array into 1D array
		
		List<String> c = city.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
		
		System.out.println("After using flatmap	: "+c);
		
		//duplicate cities
		List<String> cit = Arrays.asList("Bangalore", "Chennai", "Hyderabad", "Ahmedabad", "Ajmer", "Chennai", "Hyderabad", "Ahmedabad", "Ajmer");
		
		//remove duplicate cities
		List<String> uniqueCities = cit.stream().distinct().collect(Collectors.toList());
		
		System.out.println("Unique cities are	: "+uniqueCities);
		
		System.out.print("First city starts with 'C' is: ");
		
		//filter the cities starts with c and print the first one
		uniqueCities.stream().filter(x -> x.startsWith("C")).limit(1).forEach(x -> System.out.println(x));
		
		//skip the first element
		
		System.out.print("Skipped the first element	: ");
		
		uniqueCities.stream().skip(1).forEach(x -> System.out.println(x));
		
		System.out.print("Sorted the unique elements	: ");
		
		//sort the unique element
		uniqueCities.stream().sorted().forEach(x -> System.out.println(x));
		
		//print duplicates
		Set<String> set = new HashSet<String>();
		
		List<String> duplicateElements = cit.stream().filter(x -> !set.add(x)).collect(Collectors.toList());
		
		System.out.println("Duplicate strings	: "+duplicateElements);
		
		
	}

}
