package com.product.discount;

import java.util.ArrayList;
import java.util.List;

public class ProductDetails {

	public List<Product> getDetails()
	{
		List<Product> l = new ArrayList<Product>();
		
		l.add(new Product("Water-bottle", 299));
		
		l.add(new Product("Smart-watch", 1299));
		
		l.add(new Product("Head-Phone", 1899));
		
		l.add(new Product("Year-cord", 499));
		
		return l;
	}
}
