package com.fdmgroup.BookStoreTDD;

public class Checkout {
	public Checkout() {

	}

	double sum = 0;
	double tenPercent = 0.00;

	public double calculatePrice(Basket b) {
		int multiplesOf3 = ((int)b.getBooksInBasket()/3);
		
		if (b.getBooksInBasket()>=10) {
			tenPercent = 0.10;
		}
		
		for (Book i : b.getBasket()) {
			sum = sum + i.getPrice();			
			if (b.getBooksInBasket()<=10) {	
			}
		}
		return sum -(sum* multiplesOf3 *0.01)-(sum*tenPercent);
	}

}
