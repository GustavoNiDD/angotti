package com.example.exercicio1mysql.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.exercicio1mysql.models.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}