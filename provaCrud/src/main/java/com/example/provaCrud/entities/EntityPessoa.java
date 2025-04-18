package com.example.provaCrud.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
public class EntityPessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter @Setter
    private String nome;

    @Getter @Setter
    private String cpf;

    @ManyToOne
    @JoinColumn(name = "trabalho_id")
    @Getter @Setter
    private EntityTrabalho trabalho;

    public EntityPessoa() {
    }

    public EntityPessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
}
