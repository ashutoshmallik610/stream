package com.grpby.lenght;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Java", "Spring", "Backend", "microservices", "api", "upi", ".net", "cloud", "hello");
		
		Map<Object, List<String>> output = list.stream().filter(x -> x.length() > 4).collect(Collectors.groupingBy(x -> x.length()));
		
		System.out.println(output);
		
		//group those words length greater than 4
		Map<Object, List<String>> output1 = list.stream().collect(Collectors.groupingBy(x -> x.length()));
		
		System.out.println(output1);
		
		String str = "swiss";
		
		Character res = str.chars().mapToObj(c -> (char)c).filter(ch -> str.lastIndexOf(ch) == str.indexOf(ch)).findFirst().get();
		
		System.out.println(res);
		
	}

}
