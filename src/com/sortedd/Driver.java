package com.sortedd;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Driver {

	public static void main(String[] args) {


		List<Integer> nums = new ArrayList<Integer>();
		
		nums.add(10);
		nums.add(7);
		nums.add(50);
		nums.add(20);
		nums.add(30);
		
		// Sorted elements in ascending order======================================
		System.out.println(nums);
		
		List<Integer> sortedNums = nums.stream().sorted().collect(Collectors.toList());
		
		System.out.println("Elements in sorted order"+sortedNums);
		
		
		// Sorted elements in descending order======================================
		System.out.println(nums);
		
		List<Integer> sortedNumsDec = nums.stream().sorted((num1,num2) -> num2.compareTo(num1)).collect(Collectors.toList());
		
		System.out.println("Elements in descending sorted order"+sortedNumsDec);
		
		List<String> str = new ArrayList<String>();
		
		str.add("AA");
		str.add("A");
		str.add("AAAAA");
		str.add("AAA");
		str.add("AAAA");
		
		// Sorted Strings in ascending order======================================
		System.out.println(str);
		
		List<String> sortedStr = str.stream().sorted().collect(Collectors.toList());
		
		System.out.println("Strings in ascending sorted order"+sortedStr);
		
		// Sorted Strings in descending order======================================
		System.out.println(str);
		
		List<String> sortedStrDec = str.stream().sorted((str1,str2) -> str2.compareTo(str1)).collect(Collectors.toList());
		
		System.out.println("Elements in descending sorted order"+sortedStrDec);

	}

}
