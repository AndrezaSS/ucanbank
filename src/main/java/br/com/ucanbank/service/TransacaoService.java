package br.com.ucanbank.service;

import br.com.ucanbank.repository.ContaRepository;
import br.com.ucanbank.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Component
public class TransacaoService {

    @Autowired
    private TransacaoRepository tr;
    @GetMapping
    public void buscaTransacoes(){

    }
    @GetMapping
    public void buscaTransacaoPorId(){

    }

    @PostMapping
    public void insereTransacao(){

    }

}


