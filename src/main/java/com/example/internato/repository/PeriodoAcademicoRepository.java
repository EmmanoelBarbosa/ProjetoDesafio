package com.example.internato.repository;

import com.example.internato.entity.PeriodoAcademico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="periodoacademicos")
public interface PeriodoAcademicoRepository extends JpaRepository<PeriodoAcademico, Long> {}
