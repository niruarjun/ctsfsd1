package com.example.demo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
@Transactional
public interface BookDAO extends JpaRepository<Book, Integer>{

	}


