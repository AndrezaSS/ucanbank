package br.com.ucanbank.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "conta")
public class Conta {


    @OneToMany(mappedBy = "contaOrigem")
    @JsonIgnore
    List<Transacao> transacao;


    @OneToOne
    private ClientePF clientePF;

    @OneToOne
    private ClientePJ clientePJ;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id_conta")
    private Long IdContaOrigem;


    @Column(name = "agencia")
    private String agencia;
    @Column(name = "numconta")
    private String numConta;
    @Column(name = "saldo")
    private double saldo = 100.00;
    public Conta() {
    }

    public Conta(List<Transacao> transacao, ClientePF clientePF, ClientePJ clientePJ, Long idConta, String agencia, String numConta, double saldo) {
        this.transacao = transacao;
        this.clientePF = clientePF;
        this.clientePJ = clientePJ;
        this.IdContaOrigem = idConta;
        this.agencia = agencia;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public List<Transacao> getTransacao() {
        return transacao;
    }

    public void setTransacao(List<Transacao> transacao) {
        this.transacao = transacao;
    }

    public ClientePF getClientePF() {
        return clientePF;
    }

    public void setClientePF(ClientePF clientePF) {
        this.clientePF = clientePF;
    }

    public ClientePJ getClientePJ() {
        return clientePJ;
    }

    public void setClientePJ(ClientePJ clientePJ) {
        this.clientePJ = clientePJ;
    }

    public Long getIdConta() {
        return IdContaOrigem;
    }

    public void setIdConta(Long idConta) {
        this.IdContaOrigem = idConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return IdContaOrigem.equals(conta.IdContaOrigem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(IdContaOrigem);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "transacao=" + transacao +
                ", clientePF=" + clientePF +
                ", clientePJ=" + clientePJ +
                ", idConta=" + IdContaOrigem +
                ", agencia='" + agencia + '\'' +
                ", numConta='" + numConta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
