package br.com.ucanbank.model;

import br.com.ucanbank.enumeration.StatusCliente;
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
@DiscriminatorValue("pj")
public class ClientePJ extends Cliente{
    private String cnpj;


}
