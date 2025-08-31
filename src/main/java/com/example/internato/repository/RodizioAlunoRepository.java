package com.example.internato.repository;

import com.example.internato.entity.RodizioAluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="rodizioalunos")
public interface RodizioAlunoRepository extends JpaRepository<RodizioAluno, Long> {}
