package br.com.ucanbank.model;

import java.util.List;

public class Conta {

    List<Transacao> transacao;

    private int idConta;

    private String agencia;

    private String numConta;

    private double saldo;

    public Conta() {
    }

    public Conta(int idConta, String agencia, String numConta, double saldo) {
        this.idConta = idConta;
        this.agencia = agencia;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
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
