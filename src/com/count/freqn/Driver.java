package com.count.freqn;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver {

	public static void main(String[] args) {


		List<String> list = Arrays.asList("Java", "Python", "Java", "C", "Python", "Java");
		
		Map<Object, Long> freqncedCounted = list.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
		
		freqncedCounted.forEach((key, value) -> System.out.println(key +" -> "+value));
		
//		System.out.println(freqncedCounted);

	}

}
