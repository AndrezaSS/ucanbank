package br.com.ucanbank.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;
@Entity
public class Conta {

    List<Transacao> transacao;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idConta;

    private String agencia;

    private String numConta;

    private double saldo;

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
    public String toString() {
        return "Conta{" +
                "idConta=" + idConta +
                ", agencia=" + agencia +
                ", numConta=" + numConta +
                ", saldo=" + saldo +
                '}';
    }
}
