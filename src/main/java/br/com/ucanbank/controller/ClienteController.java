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
        return ResponseEntity.ok(clienteService.buscaClientes());
    }

    @GetMapping("/cliente/{id}")
    public ResponseEntity<?> buscaClientePorId(@PathVariable Long id) {

        Optional<Cliente> cliente = clienteService.buscaClientePorId(id);

        if (cliente.isPresent()) {
            return ResponseEntity.ok(cliente.get());
        }
        return ResponseEntity.ok().body("Id do cliente não encontrado");

    }

    @PostMapping
    @RequestMapping("/clientepf")
    public ResponseEntity<ClientePF> insereClientePF(@RequestBody ClientePF clientePF) {
        return ResponseEntity.ok(clienteService.insereClientePF(clientePF));
    }

    @PostMapping
    @RequestMapping("/clientepj")
    public ResponseEntity<ClientePJ> insereClientePJ(@RequestBody ClientePJ clientePJ) {
        return ResponseEntity.ok(clienteService.insereClientePJ(clientePJ));
    }

    @PutMapping("/alteraclientepf/{id}")
    public ResponseEntity<ClientePF> alteraClientePF(@RequestBody ClientePF clientePF) {
        return ResponseEntity.ok(clienteService.alteraClientePF(clientePF));
    }

    @PutMapping("/alteraclientepj/{id}")
    public ResponseEntity<ClientePJ> alteraClientePJ(@RequestBody ClientePJ clientePJ) {
        return ResponseEntity.ok(clienteService.alteraClientePJ(clientePJ));
    }
}
