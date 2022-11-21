package br.com.ucanbank.service;

import br.com.ucanbank.model.ClientePF;
import br.com.ucanbank.model.ClientePJ;
import br.com.ucanbank.model.Conta;
import br.com.ucanbank.repository.ClienteRepository;
import br.com.ucanbank.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
        try{
            return crc.findAll();
        }catch (Exception e) {
            throw new RuntimeException(e.getMessage() + "Erro ao tentar buscar as contas");
        }
    }

    @GetMapping
    public Optional<Conta> buscaContaPorId(Long id) {
        try{
            return crc.findById(id);
        }catch (Exception e) {
            throw new RuntimeException(e.getMessage() + "Erro ao tentar buscar uma conta por id");
        }
    }

    @PostMapping
    public Conta insereContaPF(Conta conta) {
        try {
            ClientePF clientepf = cr.save(conta.getClientePF());
            conta.setClientePF(clientepf);
            return crc.save(conta);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage() + "Erro ao tentar inserir uma conta PF");
        }
    }

    @PostMapping
    public Conta insereContaPJ(Conta conta) {
        try {
            {
                ClientePJ clientepj = cr.save(conta.getClientePJ());
                conta.setClientePJ(clientepj);
                return crc.save(conta);
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage() + "Erro ao tentar inserir uma conta PJ");
        }
    }

    @PutMapping
    public Conta alteraConta(Conta conta) {
        try {
            return crc.save(conta);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage() + "Erro ao tentar alterar a conta");
        }
    }


    @DeleteMapping
    public void deletaConta(Long id) {
        try {
            crc.deleteById(id);

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage() + "Erro ao tentar deletar o cliente");
        }
    }
}

