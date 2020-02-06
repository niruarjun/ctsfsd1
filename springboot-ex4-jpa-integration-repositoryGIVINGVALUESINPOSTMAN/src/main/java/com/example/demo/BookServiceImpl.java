package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import lombok.AllArgsConstructor;
@Service
@EnableTransactionManagement
public class BookServiceImpl implements BookService{
	private BookDAO bookDAO;
	

	@Override
	//@Transactional
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookDAO.findAll();
	}

	@Override
//	@Transactional
	public Optional<Book> getBookById(Integer bookId) {
		// TODO Auto-generated method stub
Optional<Book> book=bookDAO.findById(bookId);
		
		return book;
	}

	@Override
	public Book createBook(Book book) {
		// TODO Auto-generated method stub
		return bookDAO.save(book);
	}

	@Autowired
	public BookServiceImpl(BookDAO bookDAO) {
		super();
		this.bookDAO = bookDAO;
	}

	@Override
//	@Transactional
	public void deleteBookById(Integer bookId) {
		bookDAO.deleteById(bookId);
	}

	@Override
	public void deleteAll() {
		bookDAO.deleteAll();
	}
	
	@Override
	@Transactional
	public List<Book> findAuthor(String author) {
		
		return bookDAO.findByAuthor(author);
	}

	@Override
	public List<Book> findByBookName(String bookName) {
		// TODO Auto-generated method stub
		return bookDAO.findByBookName(bookName);
	}

	@Override
	@Transactional
	public List<Book> findByAuthorAndBookName(String author, String bookName) {
		// TODO Auto-generated method stub
		return bookDAO.findByAuthorAndBookName(author,bookName);
	}

	
	@Override
	public void deleteByBookName(String bookname) {
		// TODO Auto-generated method stub
	    bookDAO.deleteByBookName(bookname);
	}

	@Override
	public void deleteByAuthorName(String author) {
		 bookDAO.deleteByBookName(author);
	}

	
	

}
