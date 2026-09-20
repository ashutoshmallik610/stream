package com.count.grpBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver {

	public static void main(String[] args) {

		List<String> cities = Arrays.asList("Odisha", "Mumbai", "Bangalore", "Chennai", "Jaipur", "Noida", "Ahmedabad",
				"Hyderabad", "Gurugram", "Delhi", "Mysore");

		long totalCities = cities.stream().collect(Collectors.counting());

		System.out.println("Total cities : " + totalCities);

		Map<Object, List<String>> result = cities.stream().collect(Collectors.groupingBy(c -> c.length()));

		System.out.println(result);
	}

}
