package com.fdmgroup.BookStoreTDD;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CheckoutTest {
	private Checkout checkout;
	private Basket basket;
	private Book book1;
	private Book book2;
	

	@Before
	public void setUp() throws Exception {
		checkout = new Checkout();
		basket = new Basket();
		book1 = new Book("j", 1);
		book2 = new Book("k", 1);
	}
	

	@Test
	public void test_CalculatePrice_ReturnsDoubleZeroPointZeroWhenPassedAnEmptyBasket(){
		//test code
		
		double result = checkout.calculatePrice(basket);
		assertEquals(0, result,0.01);
	}
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithOneBook(){
		//test code
		basket.addBook(book1);
		double result = checkout.calculatePrice(basket);
		assertEquals(25.99, result,0.01);
	}
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithTwoBooks(){
		//test code
		basket.addBook(book1);
		basket.addBook(book1);
		double result = checkout.calculatePrice(basket);
		assertEquals(51.98, result,0.01);
	}
	
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithThreeBooks(){
		//test code
		basket.addBook(book1);
		basket.addBook(book1);
		basket.addBook(book1);
		double result = checkout.calculatePrice(basket);
		assertEquals(77.19, result,0.01);
	}
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithSevenBooks(){
		//test code
		basket.addBook(book1);
		basket.addBook(book1);
		basket.addBook(book1);
		basket.addBook(book1);
		basket.addBook(book1);
		basket.addBook(book1);
		basket.addBook(book1);
		double result = checkout.calculatePrice(basket);
		assertEquals(178.29, result,0.01);
	}
	
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithTenBooks(){
		//test code
		basket.addBook(book1);
		basket.addBook(book1);
		basket.addBook(book1);
		basket.addBook(book1);
		basket.addBook(book1);
		basket.addBook(book1);
		basket.addBook(book1);
		basket.addBook(book1);
		basket.addBook(book1);
		basket.addBook(book1);
		double result = checkout.calculatePrice(basket);
		assertEquals(226.11, result,0.01);
	}
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithTwoDifferntBooks(){
		//test code

		basket.addBook(book1);
		basket.addBook(book2);
		
		double result = checkout.calculatePrice(basket);
		assertEquals(49.38, result,0.01);
	}
	
	
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithMultipleCopiesOfTheSameBooks(){
		//test code

		basket.addBook(book1);
		basket.addBook(book1);
		basket.addBook(book1);
		
		
		double result = checkout.calculatePrice(basket);
		assertEquals(1.5, result,0.01);
	}

}
