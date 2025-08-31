package com.example.internato.repository;

import com.example.internato.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="alunos")
public interface AlunoRepository extends JpaRepository<Aluno, Long> {}
