package com.highest.number;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindHieghestNumber {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(432, 54, 674, 7567, 76, 476, 5234, 987, 8, 98, 7567, 987);
		
		//distinct
		List<Integer> unique = nums.stream().distinct().collect(Collectors.toList());
		
		System.out.println("Unique numbers : "+unique);
		
		//sort
		List<Integer> sorted = unique.stream().sorted((a,b) -> (b-a)).collect(Collectors.toList());
		
		System.out.println("Sorted numbers : "+sorted);
		
		//find highest
		int hieghest = sorted.stream().findFirst().get();
		
		System.out.println("Hoighest : "+hieghest);
		
		//find second hieghest
		int secondHieghest = sorted.stream().skip(1).findFirst().get();
		
		System.out.println("Hoighest : "+secondHieghest);
		
		//sorted.stream().skip(1).findFirst().get();  ->> like this find nth hieghest number (skip())
	}

}
