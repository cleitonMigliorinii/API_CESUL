package br.cesul.pedidoCesul.vendedor;

import br.cesul.pedidoCesul.pessoa.Pessoa;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity(name = "tb_vendedor")
public class VendedorModel extends Pessoa {

    @Column(unique = true)
    private String email;

    @Column(name = "password")
    private String senha;

    @CreationTimestamp
    private LocalDateTime dataCriacao;

    private  LocalDateTime dataInativacao;
    private boolean situacao;



}
