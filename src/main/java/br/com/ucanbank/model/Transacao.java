package br.com.ucanbank.model;

import br.com.ucanbank.exceptions.SaldoInsuficienteException;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

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


    public void transferencia(Conta contaDestino, Conta contaOrigem, Double valor) throws SaldoInsuficienteException {
        valorTransacao = valor;

        if (valor > 0 && contaOrigem.getSaldo() >= valor) {
            contaOrigem.setSaldo(contaOrigem.getSaldo() - valor);
            contaDestino.setSaldo(contaDestino.getSaldo() + valor);

        } else {

            throw new SaldoInsuficienteException("Saldo insuficiente para realizar a transação");
        }

    }
}

