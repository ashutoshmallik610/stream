package com.stream1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver
{
	public static void main(String[] args) {
	
		List<String> words = Arrays.asList("Helloo", "I", "am", "from", "Indiaa");
		
		System.out.println("Input : "+words);
		
		//Convert to uppercase
		List<String> output = words.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
		
		System.out.println("Output : "+output);
		
		List<Integer> length = words.stream().map(x -> x.length()).collect(Collectors.toList());
		
		//find the lenght of each
		
		System.out.println("Lenght : "+length);
		
		//find words starts with I
		
		List<String> result = words.stream().filter(x -> x.startsWith("I")).collect(Collectors.toList());
		
		System.out.println("Words starts with I : "+result);
		
		//Words > 5 to upper case
		
		List<String> result1 = words.stream().filter(x -> x.length() > 5).map(x -> x.toUpperCase()).collect(Collectors.toList());
		
		System.out.println("Words > 5 to upper case : "+result1);
	}
}
