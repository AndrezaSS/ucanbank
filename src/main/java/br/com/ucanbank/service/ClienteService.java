package br.com.ucanbank.service;

import br.com.ucanbank.enumeration.StatusCliente;
import br.com.ucanbank.model.Cliente;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


@Component
public class ClienteService {
    @GetMapping
    public void buscaClientes(){

    }
    @GetMapping
    public void buscaClientePorId(){

    }

    @PostMapping
    public void insereCliente(){

    }

    @PutMapping
    public void alteraCliente(){

    }

    public static void main(String[] args) {

        Cliente c = new Cliente();
        c.getStatusCliente();
        System.out.println(c.getStatusCliente());

    }

}
