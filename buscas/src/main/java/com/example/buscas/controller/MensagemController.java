package com.example.buscas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.buscas.domain.Mensagem;
import com.example.buscas.service.MensagemService;

@RestController
@RequestMapping("/mensagens")
public class MensagemController {
    @Autowired
    private MensagemService mensagemService;

    @GetMapping
    public List<Mensagem> getAllMensagens() {
        return mensagemService.getAllMensagens();
    }

    @PostMapping
    public ResponseEntity<Mensagem> createMensagem(@RequestBody Mensagem mensagem) {
        Mensagem novaMensagem = mensagemService.createMensagem(mensagem);
        return new ResponseEntity<>(novaMensagem, HttpStatus.CREATED);
    }
}