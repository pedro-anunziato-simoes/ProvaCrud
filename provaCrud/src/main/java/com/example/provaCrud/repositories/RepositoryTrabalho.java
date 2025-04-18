package com.example.provaCrud.repositories;

import com.example.provaCrud.entities.EntityTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryTrabalho extends JpaRepository<EntityTrabalho,Long> {
}
