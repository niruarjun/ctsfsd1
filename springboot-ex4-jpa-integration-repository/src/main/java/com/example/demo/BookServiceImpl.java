package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@Service
@EnableTransactionManagement
public class BookServiceImpl implements BookService {
	private BookDAO bookDAO;
	@Autowired
	public BookServiceImpl(BookDAO bookDAO) {
		super();
		this.bookDAO = bookDAO;
	}

	@Override
	public List<Book> getAllBooks() {
		
		return bookDAO.findAll();
	}

	@Override
	public Optional<Book> getBookById(Integer bookId) {
		//Optional<Book> book=bookDAO.findById(bookId);
		return bookDAO.findById(bookId) ;
	}

	

}
