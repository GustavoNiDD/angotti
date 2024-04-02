package com.example.biblioteca.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.biblioteca.domain.Library;
import com.example.biblioteca.repository.LibraryRepository;


// A anotação @Service é usada para indicar que uma classe é um "Service" (ou "Service Layer").
// A anotação @Service é um especialização da anotação @Component e é usada para anotar classes de serviço.
// A anotação @Component é uma superclasse para outras anotações de componentes, como @Repository, @Service e @Controller.
// Uma classe anotada com @Service é tipicamente uma classe que fornece serviços de negócios, como lógica de negócios e regras de negócios.
@Service
public class LibraryService {

    // A anotação @Autowired é usada para injetar dependências automaticamente.
    // A anotação @Autowired pode ser usada para injetar beans em propriedades,
    // métodos e construtores.
    @Autowired
    LibraryRepository repository;

    public List<Library> getAll() {
        try {
            List<Library> items = new ArrayList<Library>();

            // O método findAll() retorna um Iterable que é percorrido com o método
            // forEach() que adiciona cada item à lista items.
            // O operador :: é usado para criar expressões lambda mais claras e concisas.
            // A expressão lambda items::add é usada para adicionar cada item retornado pelo
            // método findAll() à lista items.
            // A expressão lambda items::add é equivalente a: (item) -> items.add(item)
            repository.findAll().forEach(items::add);
            return items;
        } catch (Exception e) {
            return null;
        }
    }

    public Library getById(Long id) {
        Optional<Library> Library = repository.findById(id);
        if (Library.isPresent()) {
            return Library.get();
        }
        return null;
    }

    public Library create(Library Library) {
        return repository.save(Library);
    }

    public Library update(Long id, Library item) {
        Optional<Library> existingItemOptional = repository.findById(id);

        if (existingItemOptional.isPresent()) {
            Library existingItem = existingItemOptional.get();
            existingItem.setNome(item.getNome());
            return repository.save(existingItem);
        } else {
            return null;
        }
    }

    public boolean delete(Long id) {
        try {
            repository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}