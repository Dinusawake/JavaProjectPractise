package com.capgemini.service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.capgemini.service.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {

	@Query(value="select * form Book",nativeQuery=true)
	public List<Book>getAllBooks();
}
