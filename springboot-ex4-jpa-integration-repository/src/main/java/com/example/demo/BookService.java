package com.example.demo;

import java.util.List;
import java.util.Optional;

public interface BookService {

	public List<Book> getAllBooks();
	public Optional<Book> getBookById(Integer bookId);
	

}
