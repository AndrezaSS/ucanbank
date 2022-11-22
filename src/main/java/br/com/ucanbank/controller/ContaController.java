package br.com.ucanbank.controller;

import br.com.ucanbank.model.Conta;
import br.com.ucanbank.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/conta")
public class ContaController {

    @Autowired
    private ContaService contaService;

    @GetMapping
    @RequestMapping("/all")
    public ResponseEntity<List<Conta>> buscaContas(){
        try{
            return ResponseEntity.ok(contaService.buscaContas());

        }catch (Exception e) {
            throw new RuntimeException(e.getMessage() + "Erro ao tentar buscar as contas");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscaContaPorId(@PathVariable Long id){
        try{
            Optional<Conta> conta = contaService.buscaContaPorId(id);

            if (conta.isPresent()) {
                return ResponseEntity.ok(conta.get());
                
            }
           return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }catch (Exception e) {
            throw new RuntimeException(e.getMessage() + "Erro ao tentar buscar uma conta por id");
        }
    }

    @PostMapping("/pf")
    public ResponseEntity<Conta> insereContaPF(@RequestBody Conta conta){
        try{
            return ResponseEntity.ok(contaService.insereContaPF(conta));
        }catch (Exception e) {
            throw new RuntimeException(e.getMessage() + "Erro ao tentar inserir uma conta PF");
        }
    }

    @PostMapping("/pj")
    public ResponseEntity<Conta> insereContaPJ(@RequestBody Conta conta){
        try{
            return ResponseEntity.ok(contaService.insereContaPJ(conta));
        }catch (Exception e) {
            throw new RuntimeException(e.getMessage() + "Erro ao tentar inserir uma conta PJ");
        }
    }

    @PutMapping("/alteraconta/{id}")
    public ResponseEntity<Conta> alteraConta(@RequestBody Conta conta){
        try{
            return ResponseEntity.ok(contaService.alteraConta(conta));
        }catch (Exception e) {
            throw new RuntimeException(e.getMessage() + "Erro ao tentar alterar a conta");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletaConta(@PathVariable Long id) {
        try{
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
        }catch (Exception e) {
            throw new RuntimeException(e.getMessage() + "Erro ao tentar deletar o cliente");
        }
    }
}
