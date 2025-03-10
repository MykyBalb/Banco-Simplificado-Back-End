package com.bancoPP.bancoSimples.controller;

import com.bancoPP.bancoSimples.database.BancoPessoa;
import com.bancoPP.bancoSimples.model.Pessoa;

import java.util.List;

public class ControllerPessoa {
    BancoPessoa bp = new BancoPessoa();

    public void adicionarPessoa(Pessoa p) {
        bp.insert(p);
    }

    public List<Pessoa> getAllPessoa() {
        return bp.findAll();
    }
}
