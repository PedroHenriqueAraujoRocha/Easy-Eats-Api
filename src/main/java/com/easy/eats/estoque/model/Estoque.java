package com.easy.eats.estoque.model;

import java.time.LocalDateTime;

import com.easy.eats.produto.model.Produto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TBESTOQUE")
public class Estoque {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Produto produto;
    private Integer quantidadeAtual;
    private Integer estoqueMinimo;
    private LocalDateTime dtUltimaMovimentacao;

}
