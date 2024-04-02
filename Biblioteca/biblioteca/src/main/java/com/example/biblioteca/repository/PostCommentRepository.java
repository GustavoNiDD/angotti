package com.example.biblioteca.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.biblioteca.domain.PostComment;

public interface PostCommentRepository extends CrudRepository<PostComment,Long>{
    
}
