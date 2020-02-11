package com.fdmgroup.BookStoreTDD;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CheckoutTest {
	private Checkout checkout;
	private Basket basket;
	private Book book;
	

	@Before
	public void setUp() throws Exception {
		checkout = new Checkout();
		basket = new Basket();
		book = new Book("j", 10.23);
		
	}

	@Test
	public void test_CalculatePrice_ReturnsDoubleZeroPointZeroWhenPassedAnEmptyBasket(){
		//test code
		double result = checkout.calculatePrice(basket);
		assertEquals(0, result);
	}


}
