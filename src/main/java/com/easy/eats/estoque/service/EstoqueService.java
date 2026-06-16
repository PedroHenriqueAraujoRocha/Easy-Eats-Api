package com.easy.eats.estoque.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.easy.eats.estoque.model.Estoque;
import com.easy.eats.estoque.repository.EstoqueRepository;

@Service
public class EstoqueService {
    private final EstoqueRepository repository;

    public EstoqueService(EstoqueRepository repository) {
        this.repository = repository;
    }

    public List<Estoque> listarTodos() {
        return repository.findAll();
    }

    public Estoque buscarPorId(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Estoque não encontrado"));
    }

    public Estoque salvar(Estoque estoque) {
        return repository.save(estoque);
    }

    public Estoque atualizar(Integer id, Estoque estoque) {

        Estoque estoqueExistente = buscarPorId(id);

        estoqueExistente.setProduto(estoque.getProduto());
        estoqueExistente.setQuantidadeAtual(estoque.getQuantidadeAtual());
        estoqueExistente.setEstoqueMinimo(estoque.getEstoqueMinimo());
        estoqueExistente.setDtUltimaMovimentacao(
                estoque.getDtUltimaMovimentacao());

        return repository.save(estoqueExistente);
    }

    public void deletar(Integer id) {
        repository.deleteById(id);
    }
    
}
