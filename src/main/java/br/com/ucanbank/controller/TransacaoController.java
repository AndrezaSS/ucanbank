package br.com.ucanbank.controller;


import br.com.ucanbank.exceptions.SaldoInsuficienteException;
import br.com.ucanbank.model.Transacao;
import br.com.ucanbank.service.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/transacao")
public class TransacaoController {

    @Autowired
    private TransacaoService transacaoService;
    @GetMapping
    @RequestMapping("/all")
    public ResponseEntity<List<Transacao>> buscaTransacoes(){
        try{
            return ResponseEntity.ok(transacaoService.buscaTransacoes());
        }catch (Exception e) {
            throw new RuntimeException(e.getMessage() + "Erro ao tentar buscar a lista de transações");
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> buscaTransacaoPorId(@PathVariable Long id){
        try{
            Optional<Transacao> transacao = transacaoService.buscaTransacaoPorId(id);

            if (transacao.isPresent()) {
                return ResponseEntity.ok(transacao.get());
            }
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }catch (Exception e) {
            throw new RuntimeException(e.getMessage() + "Erro ao tentar buscar uma transação por id");
        }
    }

    @PostMapping
    public ResponseEntity<Transacao> insereTransacao (@RequestBody Transacao transacao) throws SaldoInsuficienteException {
        try{
            return ResponseEntity.ok(transacaoService.insereTransacao(transacao));
        }catch (SaldoInsuficienteException e) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar a transação");
        }
    }
}
