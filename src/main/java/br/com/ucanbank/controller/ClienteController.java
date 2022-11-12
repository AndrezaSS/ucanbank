package br.com.ucanbank.controller;

import br.com.ucanbank.model.Cliente;
import br.com.ucanbank.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//Implantação do RestController para indicação da classe como controller
@RestController
//Implantação da annotation RequestMapping para indicação do caminho do endpoint
@RequestMapping("/cliente")
public class ClienteController {

     //Referenciando a classe ClienteService dentro da classe ClienteController
     @Autowired
     private ClienteService clienteService;

     //Implantação do método Get com annotation GetMapping para coletar valores
     //Implantação da annotation RequestMapping para indicação do caminho do endpoint
      @GetMapping
      @RequestMapping("/all")
      public String buscaClientes(){
          return "Metodo retornar clientes";

      }
      //Implantação da annotation PathVariable para retornar dados do Postman na chave Id
     @GetMapping("/{id}")
     public String buscaClientePorId(@PathVariable Long id){
         System.out.println("id do cliente a ser localizado " + id);
         Cliente cliente = new Cliente();
         cliente.setIdCliente(id);
         cliente.setNome("Pedro\n");
         cliente.setEmail("ooooooo");

         return cliente.getNome() + cliente.getEmail();

     }
     //Implantação do método Post para inserção de dados no objeto Cliente
     @PostMapping
     public String insereCliente(@RequestBody Cliente cliente){
         System.out.println(cliente.getNome());
         return "Método criar cliente";

     }
    //Implantação do método Put para alteração de dados no objeto Cliente
     @PutMapping("/{id}")
     public String alteraCliente(@RequestBody Cliente cliente){
         return "Metodo alterar cliente";

     }

   }
