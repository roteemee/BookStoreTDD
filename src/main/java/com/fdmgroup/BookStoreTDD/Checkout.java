package com.fdmgroup.BookStoreTDD;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Checkout {
	public Checkout() {

	}

	double sum = 0;
	double tenPercent = 0.00;
	double fivePercent = 0.00;
	
	
	Map<Book, Integer>basketMap = new HashMap<>();
	
	

	public double calculatePrice(Basket b) {
		double price;
		
		List<Book>newList = new ArrayList<>();
		
		

		for (Book r:b.getBasket()) {
			if (! basketMap.containsKey(r)) {
				basketMap.put(r, 1);
			}
			else {
				basketMap.put(r, 1+basketMap.get(r));
			}
			
		
		}
		System.out.println("basket map:" + basketMap);
		for (Entry<Book, Integer> entry : basketMap.entrySet()) {
			if (entry.getValue()>=2) {
				newList.add(entry.getKey());
			}
			
		}
	
		int multiplesOf3 = (b.getBasket().size() / 3);

		if (b.getBasket().size() >= 10) {
			tenPercent = 0.10;
		}

		if ((b.getBasket().size() == b.getBasketSet().size())&& b.getBasket().size()>1) {
			fivePercent = 0.05;
		}
		 
		for (Book i : b.getBasket()) {
			if (newList.contains(i)) {
				price = i.getPrice()*0.5;
			}
			else {
				price = i.getPrice();
			}
			sum = sum + price;
		}
		return sum - (sum * multiplesOf3 * 0.01) - (sum * tenPercent) - (sum * fivePercent);
	
	
	}

}
