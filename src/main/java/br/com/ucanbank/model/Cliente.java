package br.com.ucanbank.model;


import br.com.ucanbank.enumeration.StatusCliente;
import lombok.*;

import javax.persistence.*;


//Implantação do Entity para declarar que estas classes são entidades e devem ser persistidas no BD
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Tipo")
public class Cliente {



    //Uso de annotation Id e GenerateValue para autoincremento automático na criação dos Ids
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
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
