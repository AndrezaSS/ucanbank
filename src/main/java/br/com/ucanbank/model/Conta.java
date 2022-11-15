package br.com.ucanbank.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Conta {

    List<Transacao> transacao;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idConta;

    private String agencia;

    private String numConta;

    private double saldo;

    @OneToOne
    private Cliente cliente;

    public Conta() {
    }

    public Conta(Long idConta, String agencia, String numConta, double saldo) {
        this.idConta = idConta;
        this.agencia = agencia;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public Long getIdConta() {
        return idConta;
    }

    public void setIdConta(Long idConta) {
        this.idConta = idConta;
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
        return idConta.equals(conta.idConta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idConta);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "idConta=" + idConta +
                ", agencia=" + agencia +
                ", numConta=" + numConta +
                ", saldo=" + saldo +
                '}';
    }
}
