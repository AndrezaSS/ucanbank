package br.com.ucanbank.controller;

import br.com.ucanbank.model.Cliente;
import br.com.ucanbank.model.ClientePF;
import br.com.ucanbank.model.ClientePJ;
import br.com.ucanbank.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//Implantação do RestController para indicação da classe como controller
@RestController

public class ClienteController {

     //Referenciando a classe ClienteService dentro da classe ClienteController
     @Autowired
     private ClienteService clienteService;

     //Implantação do método Get com annotation GetMapping para coletar valores
     //Implantação da annotation RequestMapping para indicação do caminho do endpoint
      @GetMapping
      @RequestMapping("/clientes")
      public ResponseEntity<List<Cliente>> buscaClientes(){
          return ResponseEntity.ok(clienteService.buscaClientes());

      }

    //Implantação da annotation PathVariable para retornar dados do Postman na chave Id
     @GetMapping("/cliente/{id}")
     public ResponseEntity<?> buscaClientePorId(@PathVariable Long id){
         Optional<Cliente> cliente = clienteService.buscaClientePorId(id);

         if (cliente.isPresent()) {
             return ResponseEntity.ok(cliente.get());
         }

         return new ResponseEntity<>(HttpStatus.NOT_FOUND);
     }

     //Implantação do método Post para inserção de dados no objeto Cliente
     @PostMapping
     @RequestMapping("/clientepf")
     public ResponseEntity<ClientePF> insereClientePF(@RequestBody ClientePF clientePF){

         return ResponseEntity.ok(clienteService.insereClientePF(clientePF));
     }

    @PostMapping
    @RequestMapping("/clientepj")
    public ResponseEntity<ClientePJ> insereClientePJ(@RequestBody ClientePJ clientePJ){

        return ResponseEntity.ok(clienteService.insereClientePJ(clientePJ));
    }

    //Implantação do método Put para alteração de dados no objeto Cliente

    @PutMapping("/alteraclientepf/{id}")
     public ResponseEntity<ClientePF> alteraClientePF(@RequestBody ClientePF clientePF){
         return ResponseEntity.ok(clienteService.alteraClientePF(clientePF));
     }

    @PutMapping("/alteraclientepj/{id}")
    public ResponseEntity<ClientePJ> alteraClientePJ(@RequestBody ClientePJ clientePJ){
        return ResponseEntity.ok(clienteService.alteraClientePJ(clientePJ));
    }


   }
