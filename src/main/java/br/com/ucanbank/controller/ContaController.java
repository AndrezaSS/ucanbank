package br.com.ucanbank.controller;


import br.com.ucanbank.model.ClientePF;
import br.com.ucanbank.model.ClientePJ;
import br.com.ucanbank.model.Conta;
import br.com.ucanbank.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static java.nio.file.Files.write;

@RestController
@RequestMapping("/conta")
public class ContaController {

    @Autowired
    private ContaService contaService;
    @GetMapping
    @RequestMapping("/all")
    public ResponseEntity<List<Conta>> buscaContas(){

        return ResponseEntity.ok(contaService.buscaContas());    }
    @GetMapping("/{id}")
    public ResponseEntity<?> buscaContaPorId(@PathVariable Long id){
        Optional<Conta> conta = contaService.buscaContaPorId(id);

        if (conta.isPresent()) {
            return ResponseEntity.ok(conta.get());
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/pf")
    public ResponseEntity<Conta> insereContaPF(@RequestBody Conta conta){
        return ResponseEntity.ok(contaService.insereContaPF(conta));
    }

    @PostMapping("/pj")
    public ResponseEntity<Conta> insereContaPJ(@RequestBody Conta conta){
        return ResponseEntity.ok(contaService.insereContaPJ(conta));
    }


    @PutMapping("/alteraconta/{id}")
    public ResponseEntity<Conta> alteraConta(@RequestBody Conta conta){

        return ResponseEntity.ok(contaService.alteraConta(conta));
    }



    //Implantação do método deletaConta usando annotation DeleteMapping para exclusão de Conta
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletaConta(@PathVariable Long id) throws Exception{
        if (id == null) {
            return ResponseEntity.badRequest().body("Id não pode ser null");
        }

        Optional<Conta> conta = contaService.buscaContaPorId(id);

        if (conta.isPresent()) {
            contaService.deletaConta(id);
            return ResponseEntity.ok().body("Conta excluida com sucesso");

        } else {
            return ResponseEntity.ok().body("Conta não encontrada");
        }
    }

}
