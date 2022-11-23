package br.com.ucanbank.service;

import br.com.ucanbank.model.Cliente;
import br.com.ucanbank.model.ClientePF;
import br.com.ucanbank.model.ClientePJ;
import br.com.ucanbank.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;
import java.util.Optional;

    @Component
    public class ClienteService {

    @Autowired
    private ClienteRepository cr;

    @GetMapping
    public List<Cliente> buscaClientes(){
        try{
            return cr.findAll();
        }catch (Exception e) {
            throw new RuntimeException(e.getMessage() + "Erro ao tentar buscar os clientes");
        }
    }

    @GetMapping
    public Optional<Cliente> buscaClientePorId(Long id){
        try{
            return cr.findById(id);
        }catch (Exception e) {
            throw new RuntimeException(e.getMessage() + "Erro ao tentar buscar um cliente por id");
        }
    }

    @PostMapping
    public ClientePF insereClientePF(ClientePF clientePF){
        try{
            return cr.save(clientePF);
        }catch (Exception e) {
            throw new RuntimeException(e.getMessage() + "Erro ao tentar inserir um cliente PF");
        }
    }

    @PostMapping
    public ClientePJ insereClientePJ(ClientePJ clientePJ){
        try{
            return cr.save(clientePJ);
        }catch (Exception e) {
            throw new RuntimeException(e.getMessage() + "Erro ao tentar inserir um cliente PJ");
        }
    }

    @PutMapping
    public ClientePF alteraClientePF(ClientePF clientePF){
        try{
            return cr.save(clientePF);
        }catch (Exception e) {
            throw new RuntimeException(e.getMessage() + "Erro ao tentar alterar um cliente PF");
        }
    }

    @PutMapping
    public ClientePJ alteraClientePJ(ClientePJ clientePJ){
        try{
            return cr.save(clientePJ);
        }catch (Exception e) {
            throw new RuntimeException(e.getMessage() + "Erro ao tentar alterar um cliente PJ");
        }
    }
}
