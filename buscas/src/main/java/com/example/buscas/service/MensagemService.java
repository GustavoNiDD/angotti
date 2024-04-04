package com.example.buscas.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.buscas.domain.Mensagem;
import com.example.buscas.repository.MensagemRepository;

@Service
public class MensagemService {
    @Autowired
    private MensagemRepository mensagemRepository;
    
    public List<Mensagem> getAllMensagens() {
        return mensagemRepository.findAll();
    }

    public Mensagem createMensagem(Mensagem mensagem) {
        return mensagemRepository.save(mensagem);
    }
    
}