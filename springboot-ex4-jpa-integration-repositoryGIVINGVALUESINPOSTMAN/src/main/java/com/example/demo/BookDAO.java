package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface BookDAO extends JpaRepository<Book, Integer> {

	public List<Book> findByAuthor(String author);

	public List<Book> findByBookName(String bookName);

	public List<Book> findByAuthorAndBookName(String author, String bookName);

	public void deleteByBookName(String bookName);

	
     
}
