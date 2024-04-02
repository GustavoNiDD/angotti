package com.example.biblioteca.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.biblioteca.domain.Post;

public interface PostRepository extends CrudRepository<Post,Long>{
    
}
