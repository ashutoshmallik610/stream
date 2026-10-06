package com.nameString.charName;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver {

	public static void main(String[] args) {

		String name = "Gaurav";
		
		
		List<Character> res = name.chars().mapToObj(c -> (char)c).collect(Collectors.toList());
		
		System.out.println(res);
		
		res.forEach(c -> System.out.println(c));
		
//		Stream<Character> res1 = name.chars().mapToObj(c -> (char)c);
//		
//		res1.forEach(c -> System.out.println(c));
		
//		 // Each char[] contains exactly one character
//        List<char[]> res = name.chars().mapToObj(c -> new char[]{(char) c}).collect(Collectors.toList());
//
//        // Printing each char[] properly
//        res.forEach(arr -> System.out.println(arr[0]));
	}

}
