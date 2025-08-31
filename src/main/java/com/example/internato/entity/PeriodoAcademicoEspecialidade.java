package com.example.internato.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class PeriodoAcademicoEspecialidade {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional=false)
    private PeriodoAcademico periodo;

    @ManyToOne(optional=false)
    private Especialidade especialidade;

    private Integer cargaHorariaObrigatoria;
}
