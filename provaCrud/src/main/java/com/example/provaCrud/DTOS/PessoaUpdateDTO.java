package com.example.provaCrud.DTOS;

import lombok.Getter;

@Getter
public class PessoaUpdateDTO {

    private String nome;
    private String cpf;

    public PessoaUpdateDTO(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
