package br.com.ucanbank.controller;

import br.com.ucanbank.model.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")

public class ClienteController {
      @GetMapping
      @RequestMapping("/all")
      public String buscaClientes(){
          return "Metodo retornar clientes";

      }
     @GetMapping("/{id}")
     public String buscaClientePorId(@PathVariable int id){
         System.out.println("id do cliente a ser localizado " + id);
         Cliente cliente = new Cliente();
         cliente.setIdCliente(id);
         cliente.setNome("Pedro\n");
         cliente.setEmail("ooooooo");

         return cliente.getNome() + cliente.getEmail();

     }

     @PostMapping
     public String insereCliente(@RequestBody Cliente cliente){
         System.out.println(cliente.getNome());
         return "Método criar cliente";

     }

     @PutMapping("/{id}")
     public String alteraCliente(@RequestBody Cliente cliente){
         return "Metodo alterar cliente";

     }

   }
