package br.com.ucanbank.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transacao")

public class TransacaoController {
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
