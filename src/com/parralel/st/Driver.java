package com.parralel.st;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver {

	public static void main(String[] args) {

		List<String> cities = Arrays.asList("Bangalore", "Chennai", "Hyderbad", "Delhi", "Mumbai", "Jaipur");

		// single threaded
		List<String> r = cities.stream().filter(x -> x.startsWith("B")).collect(Collectors.toList());

		System.out.println(r);

		// Multi threaded
		List<String> rs = cities.parallelStream().filter(x -> x.startsWith("B")).collect(Collectors.toList());

		System.out.println(rs);

	}

}
