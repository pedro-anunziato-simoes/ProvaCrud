package com.example.provaCrud.repositories;

import com.example.provaCrud.entities.EntityPessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryPessoa extends JpaRepository<EntityPessoa,Long> {
}
