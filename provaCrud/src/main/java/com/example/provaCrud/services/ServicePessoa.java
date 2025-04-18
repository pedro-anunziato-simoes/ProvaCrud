package com.example.provaCrud.services;

import com.example.provaCrud.DTOS.PessoaUpdateDTO;
import com.example.provaCrud.entities.EntityPessoa;
import com.example.provaCrud.entities.EntityTrabalho;
import com.example.provaCrud.repositories.RepositoryPessoa;
import com.example.provaCrud.repositories.RepositoryTrabalho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServicePessoa {

    @Autowired
    RepositoryPessoa repositoryPessoa;
    @Autowired
    RepositoryTrabalho repositoryTrabalho;

    public List<EntityPessoa> buscarTodasPessoas(){
        return repositoryPessoa.findAll();
    }

    public EntityPessoa adicionarTrabalho(Long pessoaId, Long TrabalhoId){
        EntityPessoa pessoa = repositoryPessoa.findById(pessoaId).orElseThrow();
        EntityTrabalho trabalho = repositoryTrabalho.findById(TrabalhoId).orElseThrow();
        pessoa.setTrabalho(trabalho);
        return repositoryPessoa.save(pessoa);
    }

    public EntityPessoa cirarPessoa(EntityPessoa pessoa){
        return repositoryPessoa.save(pessoa);
    }

    public EntityPessoa alterarPessoa(PessoaUpdateDTO dto,Long id){
        EntityPessoa pessoa = repositoryPessoa.findById(id).orElseThrow();
        pessoa.setCpf(dto.getCpf());
        pessoa.setNome(dto.getNome());
        return repositoryPessoa.save(pessoa);
    }

    public void deletarPessoa(Long id){
        repositoryPessoa.deleteById(id);
    }
}
