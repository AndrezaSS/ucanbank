package br.com.ucanbank.model;

import br.com.ucanbank.enumeration.StatusCliente;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Objects;

@Entity
@DiscriminatorValue("pf")
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ClientePF clientePF = (ClientePF) o;
        return cpf.equals(clientePF.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cpf);
    }
}
