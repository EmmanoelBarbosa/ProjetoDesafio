package com.example.internato.repository;

import com.example.internato.entity.Especialidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="especialidades")
public interface EspecialidadeRepository extends JpaRepository<Especialidade, Long> {}
