package com.example.internato.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class SemestreLetivo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique=true, nullable=false)
    private String descricao;

    private LocalDate dataInicio;
    private LocalDate dataFim;
    private boolean encerrado = false;
}
