package br.com.ucanbank.model;

import br.com.ucanbank.enumeration.StatusCliente;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Objects;

@Entity
@DiscriminatorValue("pj")
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ClientePJ clientePJ = (ClientePJ) o;
        return cnpj.equals(clientePJ.cnpj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cnpj);
    }
}
