package com.example.internato.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Usuario {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nome;

    @Email @Column(unique = true, nullable = false)
    private String email;

    @Enumerated(EnumType.STRING)
    private com.example.internato.entity.enums.Role role;
}
