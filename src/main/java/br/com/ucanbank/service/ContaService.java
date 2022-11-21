package br.com.ucanbank.service;

import br.com.ucanbank.model.Cliente;
import br.com.ucanbank.model.ClientePF;
import br.com.ucanbank.model.ClientePJ;
import br.com.ucanbank.model.Conta;
import br.com.ucanbank.repository.ClienteRepository;
import br.com.ucanbank.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;
import java.util.Optional;

//Uso da annotation Component para indicação que essa classe será gerenciada pelo SpringBoot
@Component
public class ContaService {

    @Autowired
    private ContaRepository crc;

    @Autowired
    private ClienteRepository cr;

    @GetMapping
    public List<Conta> buscaContas() {
        return crc.findAll();
    }

    @GetMapping
    public Optional<Conta> buscaContaPorId(Long id) {
        return crc.findById(id);
    }

    @PostMapping
    public Conta insereContaPF(Conta conta) {
        ClientePF clientepf = cr.save(conta.getClientePF());
        conta.setClientePF(clientepf);
        return crc.save(conta);
    }

    @PostMapping
    public Conta insereContaPJ(Conta conta) {
        ClientePJ clientepj = cr.save(conta.getClientePJ());
        conta.setClientePJ(clientepj);
        return crc.save(conta);
    }

    @PutMapping
    public Conta alteraConta(Conta conta) {
        return crc.save(conta);
    }


    @DeleteMapping
    public void deletaConta(Long id) {

        crc.deleteById(id);
    }
}

