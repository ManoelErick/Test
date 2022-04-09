package com.dev.demo.market;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dev.demo.market.entities.Category;
import com.dev.demo.market.repository.CategoryRepository;

@SpringBootApplication
public class InitialProjectMarketApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(InitialProjectMarketApplication.class, args);
	}
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(1L, "Books");
		Category cat2 = new Category(2L, "Fashion");
		Category cat3 = new Category(3L, "Eletronics");
		Category cat4 = new Category(4L, "Decorations");
		Category cat5 = new Category(5L, "Tools");
		
		categoryRepository.save(cat1);
		categoryRepository.save(cat2);
		categoryRepository.save(cat3);
		categoryRepository.save(cat4);
		categoryRepository.save(cat5);
		
	}

	
}
