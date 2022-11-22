package br.com.ucanbank.service;

import br.com.ucanbank.exceptions.SaldoInsuficienteException;
import br.com.ucanbank.model.Transacao;
import br.com.ucanbank.model.TransacaoDTO;
import br.com.ucanbank.repository.ClienteRepository;
import br.com.ucanbank.repository.ContaRepository;
import br.com.ucanbank.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Component
public class TransacaoService {

    @Autowired
    private TransacaoRepository tr;

    @Autowired
    private ContaRepository cr;

    @Autowired
    private ContaService cs;

    @GetMapping
    public List<Transacao> buscaTransacoes() {
        try {
            return tr.findAll();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage() + "Erro ao tentar buscar a lista de transações");
        }
    }

    @GetMapping
    public Optional<Transacao> buscaTransacaoPorId(Long id) {
        try {
            return tr.findById(id);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage() + "Erro ao tentar buscar uma transação por id");
        }
    }

    @PostMapping
    public Transacao insereTransacao(TransacaoDTO transacaoDTO) throws SaldoInsuficienteException {
        try {
            Transacao transacao1 = new Transacao();
            transacao1.setContaOrigem(cr.findById(transacaoDTO.getContaOrigem()).get());
            transacao1.setContaDestino(cr.findById(transacaoDTO.getContaDestino()).get());
            transacao1.setDataTransacao(transacaoDTO.getDataTransacao());
            transacao1.setValorTransacao(transacaoDTO.getValorTransacao());

            transacao1.transferencia(transacao1.getContaDestino(), transacao1.getContaOrigem(),
                    transacao1.getValorTransacao());

            return tr.save(transacao1);

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage() + " Erro ao tentar acessar a conta");
        }
    }
}


