package com.example.provaCrud.DTOS;

public class TrabalhoUpdateDTO {

    private String endereco;

    public TrabalhoUpdateDTO(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
