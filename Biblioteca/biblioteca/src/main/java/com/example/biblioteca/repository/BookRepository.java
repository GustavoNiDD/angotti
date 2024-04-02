package com.example.biblioteca.repository;


import org.springframework.data.repository.CrudRepository;

import com.example.biblioteca.domain.Book;

public interface BookRepository extends CrudRepository<Book,Long> {
    
}