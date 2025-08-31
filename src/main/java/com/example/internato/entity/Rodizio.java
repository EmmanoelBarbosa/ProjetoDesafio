package com.example.internato.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Rodizio {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional=false)
    private LocalEspecialidade localEspecialidade;

    @ManyToOne
    private Usuario preceptor;

    private LocalDateTime dataHoraInicio;
    private LocalDateTime dataHoraFim;

    @Enumerated(EnumType.STRING)
    private com.example.internato.entity.enums.Turno turno;

    private Integer qtdVagas;
}
