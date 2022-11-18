package br.com.ucanbank.service;

import br.com.ucanbank.model.Conta;
import br.com.ucanbank.model.Transacao;
import br.com.ucanbank.repository.ContaRepository;
import br.com.ucanbank.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Component
public class TransacaoService {

    @Autowired
    private TransacaoRepository tr;
    @GetMapping
    public List<Transacao> buscaTransacoes(){
        return tr.findAll();
    }
    @GetMapping
    public Optional<Transacao> buscaTransacaoPorId(Long id){
        return tr.findById(id);
    }

    @PostMapping
    public Transacao insereTransacao(Transacao transacao){
        return tr.save(transacao);
    }

}


