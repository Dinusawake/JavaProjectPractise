package com.cognizant.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.service.entity.BookEntity;

public interface BookRepository extends JpaRepository<BookEntity, Integer> {

}
