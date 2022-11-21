package br.com.ucanbank.service;

import br.com.ucanbank.exceptions.SaldoInsuficienteException;
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

    @Autowired
    private ContaRepository cr;

    @Autowired
    private ContaService cs;

    @GetMapping
    public List<Transacao> buscaTransacoes(){
        try{
            return tr.findAll();
        }catch (Exception e) {
            throw new RuntimeException(e.getMessage() + "Erro ao tentar buscar a lista de transações");
        }
    }
    @GetMapping
    public Optional<Transacao> buscaTransacaoPorId(Long id){
        try{
            return tr.findById(id);
        }catch (Exception e) {
            throw new RuntimeException(e.getMessage() + "Erro ao tentar buscar uma transação por id");
        }
    }
    @PostMapping
    public Transacao insereTransacao(Transacao transacao) throws SaldoInsuficienteException{
        try{
            Transacao transacao1 = new Transacao();
            transacao1.transferencia(transacao.getContaOrigem(), transacao.getContaDestino(),
                    transacao.getValorTransacao());
            return tr.save(transacao);
        }catch (SaldoInsuficienteException e) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar a transação");
        }
    }
}


