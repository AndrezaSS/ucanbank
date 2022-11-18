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
        return cr.findAll();
    }
    @GetMapping
    public Optional<Cliente> buscaClientePorId(Long id){
        return cr.findById(id);
    }

    @PostMapping
    public ClientePF insereClientePF(ClientePF clientePF){

        return cr.save(clientePF);
    }

    @PostMapping
    public ClientePJ insereClientePJ(ClientePJ clientePJ){
        return cr.save(clientePJ);
    }

    @PutMapping
    public ClientePF alteraClientePF(ClientePF clientePF){
        return cr.save(clientePF);
    }

    @PutMapping
    public ClientePJ alteraClientePJ(ClientePJ clientePJ){

        return cr.save(clientePJ);
    }

    public static void main(String[] args) {

        Cliente c = new Cliente();
        c.getStatusCliente();
        System.out.println(c.getStatusCliente());

    }

}
