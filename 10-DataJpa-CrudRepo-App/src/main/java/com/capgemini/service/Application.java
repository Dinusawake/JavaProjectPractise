package com.capgemini.service;

import java.util.Optional;

import org.springframework.aop.framework.AopContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.capgemini.service.entity.Book;
import com.capgemini.service.repository.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctxt =SpringApplication.run(Application.class, args);

		BookRepository repo = ctxt.getBean(BookRepository.class);

//		Book b = new Book();
//		
//		b.setBookName("Spring");
//
//		b.setBookPrice(1000.00);
//
//		repo.save(b);
//
//		System.out.println("***************Record inserted.....**********");

//		
//		Optional<Book> b=repo.findById(1);
//		
//		System.out.println(b);
//		
//		System.out.println("Exit by id : "+repo.existsById(2));
//		
//		System.out.println("Reocord Count :  "+repo.count());
//		
		repo.deleteById(10001);
	}

}
