package com.example.internato.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class RodizioAluno {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional=false)
    private Rodizio rodizio;

    @ManyToOne(optional=false)
    private Aluno aluno;

    @Enumerated(EnumType.STRING)
    private com.example.internato.entity.enums.StatusRodizioAluno status = com.example.internato.entity.enums.StatusRodizioAluno.AGENDADO;
}
