package com.example.provaCrud.controllers;

import com.example.provaCrud.DTOS.PessoaUpdateDTO;
import com.example.provaCrud.entities.EntityPessoa;
import com.example.provaCrud.services.ServicePessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class ControllerPessoa {

    @Autowired
    ServicePessoa servicePessoa;

    @GetMapping
    public List<EntityPessoa> buscarTodasPessoas(){
        return servicePessoa.buscarTodasPessoas();
    }

    @PostMapping("/add")
    public EntityPessoa criarPessoa(@RequestBody EntityPessoa pessoa){
        return servicePessoa.cirarPessoa(pessoa);
    }

    @PutMapping("/alterar/{id}")
    public EntityPessoa alterarPessoa(@RequestBody PessoaUpdateDTO dto, @PathVariable Long id){
        return servicePessoa.alterarPessoa(dto,id);
    }

    @DeleteMapping("/{id}")
    public void deletarPessoa(@PathVariable Long id){
        servicePessoa.deletarPessoa(id);
    }

    @PostMapping("/addTrabalho/{pessoaId}/{trabalhoId}")
    public EntityPessoa adicionarTrabalho(@PathVariable Long pessoaId, @PathVariable Long trabalhoId){
        return servicePessoa.adicionarTrabalho(pessoaId,trabalhoId);
    }


}
