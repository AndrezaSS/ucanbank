package br.com.ucanbank.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "transacao")
public class Transacao {

    @ManyToOne
    @JoinColumn (name="IdContaOrigem")  //Chave estrangeira
    @JsonIgnore
    private Conta contaOrigem;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id_transacao")
    private Long idTransacao;
    @Column(name = "conta_destino")
    private String contaDestino;

    @Column(name = "data_transacao")
    private LocalDate dataTransacao;
    @Column(name = "valor_transacao")
    private double valorTransacao;

    public String getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(String contaDestino) {
        this.contaDestino = contaDestino;
    }



    public Transacao() {
    }


    public Transacao(Conta contaOrigem, Long idTransacao, String contaDestino, LocalDate dataTransacao, double valorTransacao) {
        this.contaOrigem = contaOrigem;
        this.idTransacao = idTransacao;
        this.contaDestino = contaDestino;
        this.dataTransacao = dataTransacao;
        this.valorTransacao = valorTransacao;
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
                ", idTransacao=" + idTransacao +
                ", contaDestino='" + contaDestino + '\'' +
                ", dataTransacao=" + dataTransacao +
                ", valorTransacao=" + valorTransacao +
                '}';
    }
}
