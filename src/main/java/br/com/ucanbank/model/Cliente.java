package br.com.ucanbank.model;


import br.com.ucanbank.enumeration.StatusCliente;

import javax.persistence.*;
import java.util.Objects;


//Implantação do Entity para declarar que estas classes são entidades e devem ser persistidas no BD

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Tipo")
public class Cliente {



    //Uso de annotation Id e GenerateValue para autoincremento automático na criação dos Ids
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id_cliente")
    private Long idCliente;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;
    @Column(name = "endereco")
    private String endereco;

    @Column(name = "status_cliente")
    @Enumerated(EnumType.STRING)
    private StatusCliente statusCliente = StatusCliente.INATIVO;

    public Cliente() {
    }

    public Cliente(Long idCliente, String nome, String email, String endereco, StatusCliente statusCliente) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.statusCliente = statusCliente;
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
                "idCliente=" + idCliente +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", endereco='" + endereco + '\'' +
                ", statusCliente=" + statusCliente +
                '}';
    }
}
