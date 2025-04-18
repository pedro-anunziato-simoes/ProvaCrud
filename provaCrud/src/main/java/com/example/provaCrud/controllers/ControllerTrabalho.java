package com.example.provaCrud.controllers;

import com.example.provaCrud.DTOS.PessoaUpdateDTO;
import com.example.provaCrud.DTOS.TrabalhoUpdateDTO;
import com.example.provaCrud.entities.EntityPessoa;
import com.example.provaCrud.entities.EntityTrabalho;
import com.example.provaCrud.services.ServicePessoa;
import com.example.provaCrud.services.ServiceTrabalho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/trabalhos")
public class ControllerTrabalho {

    @Autowired
    ServiceTrabalho serviceTrabalho;

    @GetMapping
    public List<EntityTrabalho> buscarTodosTrabalhos(){
        return serviceTrabalho.buscarTodosTrabalhos();
    }

    @PostMapping("/add")
    public EntityTrabalho criarPessoa(@RequestBody EntityTrabalho trabalho){
        return serviceTrabalho.cirarTrabalho(trabalho);
    }

    @PutMapping("/alterar/{id}")
    public EntityTrabalho alterarTrabalho(@RequestBody TrabalhoUpdateDTO dto, @PathVariable Long id){
        return serviceTrabalho.alterarTrabalho(dto,id);
    }

    @DeleteMapping
    public void deletarTrabalho(@PathVariable Long id){
        serviceTrabalho.deletarTrabalho(id);
    }


}
