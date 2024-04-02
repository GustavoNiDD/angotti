package com.example.biblioteca.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.biblioteca.domain.Library;

public interface LibraryRepository extends CrudRepository<Library,Long> {
    
}