package com.second.highest;

import java.util.Arrays;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(10, 20, 9, 40, 40, 25);
		
		int num = numbers.stream().distinct().sorted((a, b) -> b - a).skip(1).findFirst().get();
		
		System.out.println("Second Highest number is : "+num);
	}
}
