package com.example.internato.repository;

import com.example.internato.entity.SemestreLetivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="semestreletivos")
public interface SemestreLetivoRepository extends JpaRepository<SemestreLetivo, Long> {}
