package br.com.ucanbank.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Transacao {

    Conta contaOrigem;
    Conta contaDestino;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idTransacao;

    private LocalDate dataTransacao;

    private double valorTransacao;

    public Transacao() {
    }

    public Conta getContaOrigem() {

        return contaOrigem;
    }

    public Transacao(Conta contaOrigem, Conta contaDestino, Long idTransacao, LocalDate dataTransacao, double valorTransacao) {
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

    public LocalDate getDataTransacao() {

        return dataTransacao;
    }

    public void setDataTransacao(LocalDate dataTransacao) {

        this.dataTransacao = dataTransacao;
    }

    public double getValorTransacao() {

        return valorTransacao;
    }

    public void setValorTransacao(double valorTransacao) {

        this.valorTransacao = valorTransacao;
    }

    //Método utilizado pelo JPA para comparação de objetos
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transacao transacao = (Transacao) o;
        return idTransacao.equals(transacao.idTransacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTransacao);
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
