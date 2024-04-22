package br.cesul.pedidoCesul.pessoa;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_pessoa", discriminatorType = DiscriminatorType.STRING)
public class Pessoa {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID uuid;
    private String nome;
    private String endereco;

}