package com.doubt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Driver {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java", "Spring", "SQL", "Docker");

		/*
		 * long result = list.stream() .map(String::length) .filter(x -> x > 4)
		 * .count();
		 * 
		 * System.out.println(result);
		 */

		List<Integer> val = Arrays.asList(1, 2, 3);

		Stream<Integer> out = /* Stream.of(1, 2, 3) */ val.stream().filter(x -> {
			System.out.print(x + " ");
			return x > 1;
		})/* .forEach(e -> System.out.println(e+" ")) */;
		System.out.println(out);
	}

}
