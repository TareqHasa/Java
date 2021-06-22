package com.axsos.books.controllers;

import org.springframework.stereotype.Controller;

import com.axsos.books.services.BookService;

@Controller
public class BookController {
	private final BookService bookService;

	public BookController(BookService bookService) {
		this.bookService = bookService;
	}

}
