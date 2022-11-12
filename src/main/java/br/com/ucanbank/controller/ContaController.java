package br.com.ucanbank.controller;


import br.com.ucanbank.model.Conta;
import br.com.ucanbank.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/conta")
public class ContaController {

    @Autowired
    private ContaService contaService;
    @GetMapping
    @RequestMapping("/all")
    public String buscaContas(){
        return "Metodo retornar contas";
    }
    @GetMapping("/{id}")
    public double buscaContaPorId(@PathVariable Long id){
        System.out.println("id da transacao a ser localizado " + id);
        Conta conta = new Conta();
        conta.setIdConta(id);
        conta.setSaldo(100.00);

        return conta.getSaldo();
    }

    @PostMapping
    public String insereConta(@RequestBody Conta conta){
        System.out.println(conta.getNumConta());
        return "Método inserir conta";
    }

    @PutMapping("/{id}")
    public String alteraConta(@RequestBody Conta conta){
        return "metodo alterar conta";
    }

    //Implantação do método deletaConta usando annotation DeleteMapping para exclusão de Conta
    @DeleteMapping("/{id}")
    public Long deletaConta(@PathVariable Long id){
        System.out.println("id do cliente a ser deletado " + id);
        return id;

    }

}
