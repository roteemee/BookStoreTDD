package com.fdmgroup.BookStoreTDD;

public class Book {
	private String title;
	private double price;
	
	
	
	public Book (String title, double price ) {
		this.title = title;
		this.price = price;
		
	}
	
	protected String getTitle() {
		return title;
	}
	protected void setTitle(String title) {
		this.title = title;
	}
	protected double getPrice() {
		return price;
	}
	protected void setPrice(double price) {
		this.price = price;
	}
	
	

}
