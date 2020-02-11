package com.fdmgroup.BookStoreTDD;

public class MainAlt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book a = new Book ("Frankie Bridge", 12.91);
		Book b = new Book ("James Smith", 11.89);
//		Book c = new Book ("Tom Kerridge", 15.00);
//		Book d = new Book ("Andrzej Sapkowski", 6.47);
//		Book e = new Book ("John Bercow", 13.60);
//		Book f = new Book ("Stacey Halls", 9.09);
//		Book g = new Book ("Kiran Millwood Hargrave", 9.99);
//		Book h = new Book ("Alex Michaelides", 7.99);
//		Book i = new Book ("Kimberley Chambers", 8.99);
//		Book j = new Book ("Alex North", 8.99);
//		
		Basket basket = new Basket();
		
		basket.addBook(a);
		basket.addBook(b); 
//		basket.addBook(c);
//		basket.addBook(d);
//		basket.addBook(e);
//		basket.addBook(f);
//		basket.addBook(g);
//		basket.addBook(h);
//		basket.addBook(i);
//		basket.addBook(j);

		
Checkout checkout = new Checkout();

System.out.println(checkout.calculatePrice(basket));
	}

}
