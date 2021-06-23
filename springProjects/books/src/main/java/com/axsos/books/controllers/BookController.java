package com.axsos.books.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.axsos.books.models.Book;
import com.axsos.books.services.BookService;

@Controller
public class BookController {
	private final BookService bookService;

	public BookController(BookService bookService) {
		this.bookService = bookService;
	}

	@RequestMapping("/books")
	public String index(Model model) {
		List<Book> book = bookService.allBooks();
		model.addAttribute("books",book);
		return "book/books.jsp";
	}

	@RequestMapping("/books/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		Book books = bookService.findBook(id);
		model.addAttribute("book", books);
		return "book/show.jsp";
	}

    @RequestMapping(value="/books/{id}", method=RequestMethod.DELETE)
    public String destroy(@PathVariable("id") Long id) {
        bookService.deleteBook(id);
        return "redirect:/books";
    }

	@RequestMapping("/books/{id}/edit")
	public String edit(@PathVariable("id") Long id, Model model) {
		Book book = bookService.findBook(id);
		model.addAttribute("book", book);
		return "/book/edit.jsp";
	}

	@RequestMapping(value = "/books/{id}", method = RequestMethod.PUT)
	public String update(@Valid @ModelAttribute("book") Book book, BindingResult result) {
		if (result.hasErrors()) {
			return "/books/edit.jsp";
		} else {
			bookService.createBook(book);
			return "redirect:/books";
		}
	}
}
