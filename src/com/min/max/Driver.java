package com.min.max;

import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<Integer>();
		
		nums.add(10);
		nums.add(7);
		nums.add(50);
		nums.add(20);
		nums.add(30);
		
		// Max element ======================================
		System.out.println(nums);
		
		int maxNum = nums.stream().max((num1,num2) -> num1.compareTo(num2)).get();
		
		System.out.println("Maximum element = "+maxNum);
		
		
		// Min element ======================================
		System.out.println(nums);
		
		int minNum = nums.stream().min((num1,num2) -> num1.compareTo(num2)).get();
		
		System.out.println("Minimum element = "+minNum);

	}

}
