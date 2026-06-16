package com.easy.eats.fornecedor.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TBFORNECEDOR")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String cnpj;
    private String telefone;
    private String email;
    private Boolean flAtivo;
    private LocalDateTime dtCriacao;
}