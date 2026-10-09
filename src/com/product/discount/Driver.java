package com.product.discount;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver {

	public static void main(String[] args) {


		ProductDetails productDetails = new ProductDetails();
		
		List<Product> emp = productDetails.getDetails();
		
		List<Integer> result = emp.stream().filter(x -> x.getPrice() > 1000).map(x -> x.getPrice()-(x.getPrice() * 10/100))
				.collect(Collectors.toList());
		
		System.out.println(result);

		Map<String, Integer> result1 = emp.stream()
			    .filter(x -> x.getPrice() > 1000)
			    .collect(Collectors.toMap(
			        x -> x.getName(),                                 
			        x -> x.getPrice() - (x.getPrice() * 10 / 100)
			    ));

		System.out.println(result1);
		
	}

}
