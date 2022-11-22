package br.com.ucanbank.model;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class TransacaoDTO {
    private Long contaOrigem;
    private Long contaDestino;
    private LocalDate dataTransacao;
    private double valorTransacao;

}
