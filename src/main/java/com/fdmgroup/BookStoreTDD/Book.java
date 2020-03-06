package com.fdmgroup.BookStoreTDD;

public class Book {
	private String title;
	private double price;
	
	
	
	public Book (String title, double price ) {
		this.title = title;
		this.price = price;
		
	}
	
	protected  String getTitle() {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	
	
	
	
	

}
