package com.example.internato.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Aluno {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(optional=false, cascade=CascadeType.ALL)
    private Usuario usuario;

    @ManyToOne(optional=false)
    private PeriodoAcademico periodo;


    private int cargaHorariaCumprida;
    private int cargaHorariaObrigatoria;


    public String getNome() {
        if (this.usuario != null) {
            try {

                return this.usuario.getNome();
            } catch (Exception e) { }
        }
        return null;
    }
}
