package com.bancoPP.bancoSimples.database;

import com.bancoPP.bancoSimples.model.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class BancoPessoa {
    private List<Pessoa> pessoas;

    public BancoPessoa() {
        this.pessoas = new ArrayList<>();
    }

    // Insere um novo produto na lista
    public void insert(Pessoa p) {
        pessoas.add(p);
    }

    // Retorna todos os produtos cadastrados
    public List<Pessoa> findAll() {
        return new ArrayList<>(pessoas);
    }

    // Atualiza um produto existente na lista
    public boolean update(Pessoa p) {
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getIdPessoa() == p.getIdPessoa()) {
                pessoas.set(i, p);
                return true; // Retorno indicando que a atualização foi feita
            }
        }
        return false; // Retorna falso se o produto não foi encontrado
    }

    // Remove um produto pelo ID
    public boolean delete(int id) {
        return pessoas.removeIf(p -> p.getIdPessoa() == id);
    }
}
