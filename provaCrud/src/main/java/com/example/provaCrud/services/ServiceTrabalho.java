package com.example.provaCrud.services;

import com.example.provaCrud.DTOS.PessoaUpdateDTO;
import com.example.provaCrud.DTOS.TrabalhoUpdateDTO;
import com.example.provaCrud.entities.EntityPessoa;
import com.example.provaCrud.entities.EntityTrabalho;
import com.example.provaCrud.repositories.RepositoryPessoa;
import com.example.provaCrud.repositories.RepositoryTrabalho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceTrabalho {

    @Autowired
    RepositoryTrabalho repositoryTrabalho;

    public List<EntityTrabalho> buscarTodosTrabalhos(){
        return repositoryTrabalho.findAll();
    }

    public EntityTrabalho cirarTrabalho(EntityTrabalho pessoa){
        return repositoryTrabalho.save(pessoa);
    }

    public EntityTrabalho alterarTrabalho(TrabalhoUpdateDTO dto, Long id){
        EntityTrabalho trabalho = repositoryTrabalho.findById(id).orElseThrow();
        trabalho.setEndereco(dto.getEndereco());
        return repositoryTrabalho.save(trabalho);
    }

    public void deletarTrabalho(Long id){
        repositoryTrabalho.deleteById(id);
    }
}
