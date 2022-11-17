package br.com.ucanbank.model;

import br.com.ucanbank.enumeration.StatusCliente;

import javax.persistence.Entity;

@Entity
public class ClientePF extends Cliente{
    private String cpf;

    public ClientePF() {

    }

    public ClientePF(String cpf) {
        this.cpf = cpf;
    }

    public ClientePF(Long idCliente, String nome, String email, String endereco, StatusCliente statusCliente, String cpf) {
        super(idCliente, nome, email, endereco, statusCliente);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
