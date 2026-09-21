package com.duplicate.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Driver {
public static void main(String[] args) {
	
	List<String> list = Arrays.asList("One", "Two", "One", "Three", "One");
	
	Set<String> set = new HashSet<String>();
	
	List<String> list1 = list.stream().filter(x -> !set.add(x)).toList();
	
	System.out.println(list1);
	
}
}
