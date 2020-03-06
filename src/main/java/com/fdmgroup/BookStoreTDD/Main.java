package com.fdmgroup.BookStoreTDD;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		/**
		 * I am creating books below
		 * @author olarotimi.akinbote
		 * @version the new one
		 * 
		 * 
		 */
		// TODO Auto-generated method stub
		Book a = new Book ("Frankie Bridge", 12.91);
		Book b = new Book ("James Smith", 11.89);
		Book c = new Book ("Tom Kerridge", 15.00);
		Book d = new Book ("Andrzej Sapkowski", 6.47);
		Book e = new Book ("John Bercow", 13.60);
		Book f = new Book ("Stacey Halls", 9.09);
		Book g = new Book ("Kiran Millwood Hargrave", 9.99);
		Book h = new Book ("Alex Michaelides", 7.99);
		Book i = new Book ("Kimberley Chambers", 8.99);
		Book j = new Book ("Alex North", 8.99);
		
		Basket basket = new Basket();
		/**
		 * 
		 * This is me adding books to basket
		 * 
		 * 
		 * 
		 */
		basket.addBook(a);
		basket.addBook(b);
		basket.addBook(c);
		basket.addBook(d);
		basket.addBook(e);
		basket.addBook(f);
		basket.addBook(g);
		basket.addBook(h);
		basket.addBook(a);
		basket.addBook(a);

		
Checkout checkout = new Checkout();


System.out.println(checkout.calculatePrice(basket));
System.out.println("basket:" + basket.getBasket());
System.out.println("basket size: " + basket.getBasket().size());
//System.out.println("basket map:" + basketMap);
//System.out.println("basket map size: " + basketMap.size());





	}
}