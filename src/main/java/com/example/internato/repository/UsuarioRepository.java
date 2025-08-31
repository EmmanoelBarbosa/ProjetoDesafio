package com.example.internato.repository;

import com.example.internato.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="usuarios")
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {}
