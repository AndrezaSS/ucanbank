package br.com.ucanbank.controller;

import br.com.ucanbank.model.Cliente;
import br.com.ucanbank.model.ClientePF;
import br.com.ucanbank.model.ClientePJ;
import br.com.ucanbank.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    @RequestMapping("/clientes")
    public ResponseEntity<List<Cliente>> buscaClientes() {
        try {
            return ResponseEntity.ok(clienteService.buscaClientes());
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage() + "Erro ao tentar buscar os clientes");
        }
    }

    @GetMapping("/cliente/{id}")
    public ResponseEntity<?> buscaClientePorId(@PathVariable Long id) {
        try {
            Optional<Cliente> cliente = clienteService.buscaClientePorId(id);

            if (cliente.isPresent()) {
                return ResponseEntity.ok(cliente.get());
            }
            return ResponseEntity.ok().body("Id do cliente não encontrado");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage() + "Erro ao tentar buscar um cliente por id");
        }
    }

    @PostMapping
    @RequestMapping("/clientepf")
    public ResponseEntity<ClientePF> insereClientePF(@RequestBody ClientePF clientePF) {
        try {
            return ResponseEntity.ok(clienteService.insereClientePF(clientePF));
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage() + "Erro ao tentar inserir um cliente PF");
        }
    }

    @PostMapping
    @RequestMapping("/clientepj")
    public ResponseEntity<ClientePJ> insereClientePJ(@RequestBody ClientePJ clientePJ) {
        try {
            return ResponseEntity.ok(clienteService.insereClientePJ(clientePJ));
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage() + "Erro ao tentar inserir um cliente PJ");
        }
    }

    @PutMapping("/alteraclientepf/{id}")
    public ResponseEntity<ClientePF> alteraClientePF(@RequestBody ClientePF clientePF) {
        try {
            return ResponseEntity.ok(clienteService.alteraClientePF(clientePF));
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage() + "Erro ao tentar alterar um cliente PF");
        }
    }

    @PutMapping("/alteraclientepj/{id}")
    public ResponseEntity<ClientePJ> alteraClientePJ(@RequestBody ClientePJ clientePJ) {
        try {
            return ResponseEntity.ok(clienteService.alteraClientePJ(clientePJ));
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage() + "Erro ao tentar alterar um cliente PJ");
        }
    }
}
