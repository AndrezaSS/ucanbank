package br.com.ucanbank.controller;


import br.com.ucanbank.model.Conta;
import br.com.ucanbank.model.Transacao;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transacao")
public class TransacaoController {
    @GetMapping
    @RequestMapping("/all")
    public String buscaTransacoes(){
        return "Metodo retornar transacoes";
    }
    @GetMapping("/{id}")
    public double buscaTransacaoPorId(@PathVariable int id){

        System.out.println("id da conta a ser localizado " + id);
        Transacao transacao = new Transacao();
        transacao.setIdTransacao(id);
        transacao.setValorTransacao(100.00);

        return transacao.getValorTransacao();

    }

    @PostMapping
    public String insereTransacao(@RequestBody Transacao transacao){
        return "retorna metodo insere transacao";

    }

}
