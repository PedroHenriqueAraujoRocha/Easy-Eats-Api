package com.easy.eats.fornecedor.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "TBFORNECEDOR")
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
