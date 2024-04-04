package com.example.buscas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.buscas.domain.MensagemCorpo;

public interface MensagemCorpoRepository extends JpaRepository<MensagemCorpo, Long> {
}