package com.example.internato.repository;

import com.example.internato.entity.LocalEspecialidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="localespecialidades")
public interface LocalEspecialidadeRepository extends JpaRepository<LocalEspecialidade, Long> {}
