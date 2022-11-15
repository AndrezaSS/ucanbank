package br.com.ucanbank.model;


import br.com.ucanbank.enumeration.StatusCliente;

import javax.persistence.*;
import java.util.Objects;


//Implantação do Entity para declarar que estas classes são entidades e devem ser persistidas no BD
@Entity
@MappedSuperclass
public class Cliente {



    //Uso de annotation Id e GenerateValue para autoincremento automático na criação dos Ids
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idCliente;

    private StatusCliente statusCliente = StatusCliente.INATIVO;


    private String nome;

   private String email;

    private String endereco;

    public Cliente() {
    }

    public Cliente(Conta conta, Long idCliente, StatusCliente statusCliente, String nome, String email, String endereco) {
        this.conta = conta;
        this.idCliente = idCliente;
        this.statusCliente = statusCliente;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public StatusCliente getStatusCliente() {
        return statusCliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return idCliente.equals(cliente.idCliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCliente);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "conta=" + conta +
                ", idCliente=" + idCliente +
                ", statusCliente=" + statusCliente +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
