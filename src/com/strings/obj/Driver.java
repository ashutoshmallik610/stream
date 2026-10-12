package com.strings.obj;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver {

	public static void main(String[] args) {

		String s = "Hello";

		List<Character> result = s.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

		System.out.println(result);

		String str = "swiss";

		//Occurrence of each character from the string
		Map<Character, Long> occurance = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));

		System.out.println(occurance);

		//first non-repeating character from the string
		Character res = str.chars().mapToObj(c -> (char) c).filter(ch -> str.lastIndexOf(ch) == str.indexOf(ch))
				.findFirst().get();

		System.out.println(res);

	}

}
