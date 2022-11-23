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

    //As entidades Transacao e Conta possuem uma relação N-1.
    @ManyToOne
    @JoinColumn(name = "IdContaOrigem")  //chave estrangeira da tabela Transacao
    @JsonIgnore
    private Conta contaOrigem;

    @ManyToOne
    @JoinColumn(name = "contaDestino") //chave estrangeira da tabela Transacao
    @JsonIgnore
    private Conta contaDestino;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_transacao")
    private Long idTransacao;

    @Column(name = "data_transacao")
    private LocalDate dataTransacao;

    @Column(name = "valor_transacao")
    private double valorTransacao;

    //Método que transfere de uma conta para outra conta
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

