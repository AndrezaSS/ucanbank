package br.com.ucanbank.repository;

import br.com.ucanbank.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

//Esta interface extende o JPA, gerando comunicação entre aplicação e BD

public interface ClienteRepository extends JpaRepository<Cliente, Long> {


}
