package com.example.buscas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.buscas.domain.Mensagem;

public interface MensagemRepository extends JpaRepository<Mensagem, Long> {
}