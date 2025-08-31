package com.example.internato.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Checkin {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional=false)
    private RodizioAluno rodizioAluno;

    private LocalDateTime dataHoraCheckIn;
    private LocalDateTime dataHoraCheckOut;

    private Double latitude;
    private Double longitude;
    private Boolean presente;
    private Boolean valido;
}
