package br.com.ucanbank.controller;


import br.com.ucanbank.model.Transacao;
import br.com.ucanbank.service.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transacao")
public class TransacaoController {

    @Autowired
    private TransacaoService transacaoService;
    @GetMapping
    @RequestMapping("/all")
    public String buscaTransacoes(){
        return "Metodo retornar transacoes";
    }
    @GetMapping("/{id}")
    public double buscaTransacaoPorId(@PathVariable Long id){

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
