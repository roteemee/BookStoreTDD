package com.fdmgroup.BookStoreTDD;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Basket {
	
	
	private List <Book> basket = new ArrayList<Book>();
	private Set <Book>basketSet = new HashSet<Book>();
	
	
	public void addBook(Book b) {
		basket.add(b);
		basketSet.add(b);
	}
	
	public List<Book> getBasket(){
		return basket;
	}
	
	public Set<Book> getBasketSet(){
		return basketSet;
	}


}

