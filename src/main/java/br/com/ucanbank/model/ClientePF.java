package br.com.ucanbank.model;

import br.com.ucanbank.enumeration.StatusCliente;

public class ClientePF extends Cliente{
    private String cpf;

    public ClientePF() {

    }

    public ClientePF(Conta conta, Long idCliente, StatusCliente statusCliente, String nome, String email, String endereco, String cpf) {
        super(conta, idCliente, statusCliente, nome, email, endereco);
        this.cpf = cpf;
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
