package br.cesul.pedidoCesul.pessoa;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity(name = "tb_cliente")
public class Cliente extends Pessoa {


    private String cnpj;

    private String cidade;

    private String tipoCliente;



}