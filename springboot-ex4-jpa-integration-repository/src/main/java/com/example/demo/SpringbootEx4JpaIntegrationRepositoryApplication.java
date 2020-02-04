package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.NoArgsConstructor;

@SpringBootApplication

public class SpringbootEx4JpaIntegrationRepositoryApplication implements CommandLineRunner{
	private BookDAO bookDAO;
	


	public SpringbootEx4JpaIntegrationRepositoryApplication(BookDAO bookDAO) {
		super();
		this.bookDAO = bookDAO;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootEx4JpaIntegrationRepositoryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		bookDAO.save(new Book("Book-1","Author-1"));
		bookDAO.save(new Book("Book-2","Author-2"));
		bookDAO.save(new Book("Book-3","Author-3"));
		bookDAO.save(new Book("Book-4","Author-4"));
		bookDAO.save(new Book("Book-5","Author-5"));
		bookDAO.save(new Book("Book-6","Author-6"));
	}



}
