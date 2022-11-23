package br.com.ucanbank.model;

import br.com.ucanbank.enumeration.StatusCliente;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

//Apesar dos objetos clientePF, clientePJ serem herança da entidade Cliente, optamos em construir 1 única tabela para os respectivos objetos

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Tipo")
public class Cliente {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_cliente")
    private Long idCliente;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;
    @Column(name = "endereco")
    private String endereco;

    @Column(name = "status_cliente")
    @Enumerated(EnumType.STRING)
    private StatusCliente statusCliente = StatusCliente.INATIVO;

}
