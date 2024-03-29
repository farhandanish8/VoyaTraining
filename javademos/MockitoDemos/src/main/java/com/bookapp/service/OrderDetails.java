package com.bookapp.service;

import java.util.Collections;
import java.util.List;

import com.bookapp.model.Book;

public class OrderDetails {
	private IBookService bookService;
	
	
	public IBookService getBookService() {
		return bookService;
	}


	public void setBookService(IBookService bookService) {
		this.bookService = bookService;
	}


	public List<Book> showBooks(String author){
		List<Book>books = bookService.getByAuthor(author);
		Collections.sort(books,(b2,b1)->b1.getTitle().compareTo(b2.getTitle()));
		return books;
	}
	
	
	public String orderBook(int bookid) {
		 Book book = bookService.getById(bookid);
		return book.getTitle();
	}
	
	
	public double getTotalPriceByDiscount(double price, int  discountamount) {
		bookService.getByLessPrice(price);
		return 0.0;
}
}