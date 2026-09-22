package com.longest.string;

import java.util.Arrays;
import java.util.List;

public class Driver {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Bengalure", "Pune", "Hyderabad", "Mumbai");
		
		String result = list.stream().sorted((a, b) -> b.length() - a.length()).findFirst().get();
		
		System.out.println("Largest String is : "+result);

	}

}
