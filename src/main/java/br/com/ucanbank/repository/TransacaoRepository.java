package br.com.ucanbank.repository;

import br.com.ucanbank.model.Conta;
import br.com.ucanbank.model.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransacaoRepository extends JpaRepository<Transacao, Long> {
/*
    public Conta procuraContaPorId(Long idContaOrigem);
*/
}
