package com.fdmgroup.BookStoreTDD;

import java.util.ArrayList;
import java.util.List;

public class Basket {
	
	
	private List <Book> basket = new ArrayList<Book>();
	
	public void addBook(Book b) {
		basket.add(b);
		basket.add(b);
	}
	
	public int getBooksInBasket() {
		return basket.size();
	}
	
	public List<Book> getBasket(){
		return basket;
	}


}
