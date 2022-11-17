package br.com.ucanbank.model;

import br.com.ucanbank.enumeration.StatusCliente;

import javax.persistence.Entity;

@Entity
public class ClientePJ extends Cliente{
    private String cnpj;

    public ClientePJ() {
    }

    public ClientePJ(String cnpj) {
        this.cnpj = cnpj;
    }

    public ClientePJ(Long idCliente, String nome, String email, String endereco, StatusCliente statusCliente, String cnpj) {
        super(idCliente, nome, email, endereco, statusCliente);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
