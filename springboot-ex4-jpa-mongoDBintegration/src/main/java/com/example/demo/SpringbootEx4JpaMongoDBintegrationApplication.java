package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repo.ItemRepository;

@SpringBootApplication
public class SpringbootEx4JpaMongoDBintegrationApplication implements CommandLineRunner {
  
	/*private ItemRepository itemRepository;
	@Autowired
	public SpringbootEx4JpaMongoDBintegrationApplication(ItemRepository itemRepository) {
		super();
		this.itemRepository = itemRepository;
	}
*/
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootEx4JpaMongoDBintegrationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
