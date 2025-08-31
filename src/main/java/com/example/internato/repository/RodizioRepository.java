package com.example.internato.repository;

import com.example.internato.entity.Rodizio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="rodizios")
public interface RodizioRepository extends JpaRepository<Rodizio, Long> {}
