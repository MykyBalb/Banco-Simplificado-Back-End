package com.bancoPP.bancoSimples.view;

import com.bancoPP.bancoSimples.controller.ControllerPessoa;
import com.bancoPP.bancoSimples.model.Pessoa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ViewPessoa {

    ControllerPessoa cp = new ControllerPessoa();

    @GetMapping("/pessoas")
    public List<Pessoa> getAllPessoa() {
        return cp.getAllPessoa();
    }

    @PostMapping("/pessoas")
    public String postPessoa(@RequestBody Pessoa p) {
        cp.adicionarPessoa(p);
        return "Sucesso";
    }
}
