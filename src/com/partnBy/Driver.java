package com.partnBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(14, 5, 7, 75, 345, 64, 564, 64, 76, 3456, 355, 65, 34, 76, 77, 232, 67, 98,
				7667, 9, 35, 378, 37, 57, 592);
		
		Map<Boolean, List<Integer>> result = nums.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));

		System.out.println(result);
	}

}
