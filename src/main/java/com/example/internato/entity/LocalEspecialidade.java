package com.example.internato.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class LocalEspecialidade {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional=false)
    private LocalParceiro local;

    @ManyToOne(optional=false)
    private Especialidade especialidade;

    private Integer qtdVagasPorTurno;
    private String observacao;
}
