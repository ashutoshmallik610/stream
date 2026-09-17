package com.flattend;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver {

	public static void main(String[] args) {
		
		List<List<String>> words = Arrays.asList(Arrays.asList("Hello", "I"), Arrays.asList("am", "from"), Arrays.asList("India"));
		
		System.out.println("Before : "+words);
		
		List<String> flattend = words.stream().flatMap(x -> x.stream()).map(x -> x.toLowerCase()).collect(Collectors.toList());
		
		System.out.println("After : "+flattend);
	}
	
}
