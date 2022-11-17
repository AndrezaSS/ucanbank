package br.com.ucanbank.service;

import br.com.ucanbank.repository.ClienteRepository;
import br.com.ucanbank.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

//Uso da annotation Component para indicação que essa classe será gerenciada pelo SpringBoot
@Component
public class ContaService {

    @Autowired
    private ContaRepository crc;

    @GetMapping
    public void buscaContas(){

    }
    @GetMapping
    public void buscaContaPorId(){

    }

    @PostMapping
    public void insereConta(){

    }

    @PutMapping
    public void alteraConta(){

    }

    @DeleteMapping
    public void deletaConta(){

    }

}

