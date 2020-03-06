package com.fdmgroup.BookStoreTDD;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BasketTest {
	
	private Basket basket;
	private Book book;

	@Before
	public void setUp() throws Exception {
		basket = new Basket();
		book = new Book("j", 10.23);
	}

	@Test
	public void test_GetBooksInBasket_ReturnsEmptyBookList_IfNoBooksHaveBeenAdded(){
		int result = basket.getBasket().size();
		assertEquals(0, result);
	}
	
	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfLengthOne_AfterAddBookMethodIsCalledWithOneBook(){
		basket.addBook(book);
		assertEquals(1, basket.getBasket().size());	
	}
	
	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfLengthOne_AfterAddBookMethodIsCalledWithTwoBooks(){
		basket.addBook(book);
		basket.addBook(book);
		assertEquals(2, basket.getBasket().size());
		
	}



}
