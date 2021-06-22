package com.axsos.books.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsos.books.models.Book;
import com.axsos.books.repositories.BookRepository;

@Service
public class BookService {
	private final BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	// returns all the books
	public List<Book> allBooks() {
		return (List<Book>) bookRepository.findAll();
	}

	// creates a book
	public Book createBook(Book b) {
		return bookRepository.save(b);
	}

	// retrieves a book
	public Book findBook(Long id) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		if (optionalBook.isPresent()) {
			return optionalBook.get();
		} else {
			return null;
		}
	}

	public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
		Optional<Book> bookOptional=bookRepository.findById(id);
		if (bookOptional.isPresent()) {
			Book book= bookOptional.get();
			book.setTitle(title);
			book.setDescription(desc);
			book.setNumberOfPages(numOfPages);
			bookRepository.save(book);
			return book;
		}
		return null;
	}

	public void deleteBook(Long id) {
		Optional<Book> bookOptional=bookRepository.findById(id);
		if (bookOptional.isPresent()) {
			bookRepository.deleteById(id);
		}
	}

}
