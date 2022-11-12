package br.com.ucanbank.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transacao {

    Conta contaOrigem;
    Conta contaDestino;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idTransacao;

    private String dataTransacao;

    private double valorTransacao;

    public Transacao() {
    }

    public Conta getContaOrigem() {

        return contaOrigem;
    }

    public Transacao(Conta contaOrigem, Conta contaDestino, Long idTransacao, String dataTransacao, double valorTransacao) {
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
        this.idTransacao = idTransacao;
        this.dataTransacao = dataTransacao;
        this.valorTransacao = valorTransacao;
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

    public Long getIdTransacao() {

        return idTransacao;
    }

    public void setIdTransacao(Long idTransacao) {

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
