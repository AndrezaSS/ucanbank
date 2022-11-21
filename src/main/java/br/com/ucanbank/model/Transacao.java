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

    @ManyToOne
    @JoinColumn(name = "contaDestino")
    @JsonIgnore
    private Conta contaDestino;

    @Column(name = "data_transacao")
    private LocalDate dataTransacao;
    @Column(name = "valor_transacao")
    private double valorTransacao;

    public Conta getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(Conta contaDestino) {
        this.contaDestino = contaDestino;
    }



    public Transacao() {
    }


    public Transacao(Conta contaOrigem, Long idTransacao, Conta contaDestino, LocalDate dataTransacao, double valorTransacao) {
        this.contaOrigem = contaOrigem;
        this.idTransacao = idTransacao;
        this.contaDestino = contaDestino;
        this.dataTransacao = dataTransacao;
        this.valorTransacao = valorTransacao;
    }

    public Conta getContaOrigem() {
        return contaOrigem;
    }

    public void setContaOrigem(Conta contaOrigem) {
        this.contaOrigem = contaOrigem;
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

    public void transferencia(Conta contaDestino, Conta contaOrigem, Double valor) {
        valorTransacao = valor;
        System.out.println(contaDestino.getIdConta());
        if (valor > 0 && contaOrigem.getSaldo() >= valor) {
            contaOrigem.setSaldo(contaOrigem.getSaldo() - valor);
            contaDestino.setSaldo(contaDestino.getSaldo() + valor);

            System.out.println("O valor do saldo final da conta destino é" + contaDestino.getSaldo());
            System.out.println("O valor do saldo final da conta origem é" + contaOrigem.getSaldo());

        } else {
            System.out.println("Não foi possível realizar a transferência");
        }
    }
}

