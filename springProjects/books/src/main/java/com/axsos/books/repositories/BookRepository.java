package com.axsos.books.repositories;

import org.springframework.data.repository.CrudRepository;

import com.axsos.books.models.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
	
}
