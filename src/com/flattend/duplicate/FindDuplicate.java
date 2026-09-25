package com.flattend.duplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicate {

	public static void main(String[] args) {

		List<List<Integer>> num = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6), Arrays.asList(1, 3, 5));
		
		Set<Integer> inputNum = new HashSet<Integer>();
		
		List<Integer> result = num.stream().flatMap(x -> x.stream()).filter(w -> !inputNum.add(w)).collect(Collectors.toList());
		
		System.out.println("Duplicates : "+result);
		
	}

}
