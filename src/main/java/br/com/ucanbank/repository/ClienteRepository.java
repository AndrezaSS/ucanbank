package br.com.ucanbank.repository;

import br.com.ucanbank.model.Cliente;
import br.com.ucanbank.model.ClientePF;
import br.com.ucanbank.model.ClientePJ;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    public ClientePF findByCpf(String cpf);

    public ClientePJ findByCnpj(String cnpj);

}
