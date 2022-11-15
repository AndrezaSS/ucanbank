package br.com.ucanbank.model;

import br.com.ucanbank.enumeration.StatusCliente;

public class ClientePJ extends Cliente{
    private String cnpj;

    public ClientePJ() {
    }

    public ClientePJ(Conta conta, Long idCliente, StatusCliente statusCliente, String nome, String email, String endereco, String cnpj) {
        super(conta, idCliente, statusCliente, nome, email, endereco);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
