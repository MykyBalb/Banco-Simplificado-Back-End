package com.bancoPP.bancoSimples.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pessoa {
    private String nome;
    private String CPF;
    private String eMail;
    private String senha;
}
