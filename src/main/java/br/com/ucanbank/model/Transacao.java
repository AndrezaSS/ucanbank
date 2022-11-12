package br.com.ucanbank.model;

import java.util.Date;

public class Transacao {

    Conta contaOrigem;
    Conta contaDestino;
    private int idTransacao;

    private String dataTransacao;

    private double valorTransacao;

    public Transacao() {
    }

    public Conta getContaOrigem() {

        return contaOrigem;
    }

    public void setContaOrigem(Conta contaOrigem) {

        this.contaOrigem = contaOrigem;
    }

    public Conta getContaDestino() {

        return contaDestino;
    }

    public void setContaDestino(Conta contaDestino) {

        this.contaDestino = contaDestino;
    }

    public int getIdTransacao() {

        return idTransacao;
    }

    public void setIdTransacao(int idTransacao) {

        this.idTransacao = idTransacao;
    }

    public String getDataTransacao() {

        return dataTransacao;
    }

    public void setDataTransacao(String dataTransacao) {

        this.dataTransacao = dataTransacao;
    }

    public double getValorTransacao() {

        return valorTransacao;
    }

    public void setValorTransacao(double valorTransacao) {

        this.valorTransacao = valorTransacao;
    }

    @Override
    public String toString() {
        return "Transacao{" +
                "contaOrigem=" + contaOrigem +
                ", contaDestino=" + contaDestino +
                ", idTransacao=" + idTransacao +
                ", dataTransacao=" + dataTransacao +
                ", valorTransacao=" + valorTransacao +
                '}';
    }
}
