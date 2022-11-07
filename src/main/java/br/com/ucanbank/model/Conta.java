package br.com.ucanbank.model;

public class Conta {

    private int idConta;

    private int agencia;

    private int numConta;

    private double saldo;

    public Conta() {
    }

    public Conta(int idConta, int agencia, int numConta, double saldo) {
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

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
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
