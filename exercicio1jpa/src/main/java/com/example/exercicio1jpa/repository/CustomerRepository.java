package com.example.exercicio1jpa.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.exercicio1jpa.models.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

  List<Customer> findByLastName(String lastName);

  Customer findById(long id);
}