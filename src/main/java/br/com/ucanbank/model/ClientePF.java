package br.com.ucanbank.model;

import lombok.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

@Entity
@DiscriminatorValue("pf")
public class ClientePF extends Cliente {
    private String cpf;

}
