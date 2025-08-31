package com.example.internato.controller;

import com.example.internato.entity.Aluno;
import com.example.internato.repository.AlunoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private final AlunoRepository alunoRepository;

    public AlunoController(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }


    @PostMapping
    public ResponseEntity<Aluno> salvar(@RequestBody Aluno aluno) {
        Aluno salvo = alunoRepository.save(aluno);
        return ResponseEntity.ok(salvo);
    }


    @GetMapping
    public List<Aluno> listar() {
        return alunoRepository.findAll();
    }


    @GetMapping("/{id}")
    public ResponseEntity<Aluno> buscar(@PathVariable Long id) {
        Optional<Aluno> a = alunoRepository.findById(id);
        return a.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }


    @PutMapping("/{id}")
    public ResponseEntity<Aluno> atualizar(@PathVariable Long id, @RequestBody Aluno alunoAtualizado) {
        return alunoRepository.findById(id).map(aluno -> {

            aluno.setUsuario(alunoAtualizado.getUsuario() != null ? alunoAtualizado.getUsuario() : aluno.getUsuario());
            aluno.setPeriodo(alunoAtualizado.getPeriodo() != null ? alunoAtualizado.getPeriodo() : aluno.getPeriodo());
            aluno.setCargaHorariaCumprida(alunoAtualizado.getCargaHorariaCumprida());
            aluno.setCargaHorariaObrigatoria(alunoAtualizado.getCargaHorariaObrigatoria());
            Aluno salvo = alunoRepository.save(aluno);
            return ResponseEntity.ok(salvo);
        }).orElseGet(() -> ResponseEntity.notFound().build());
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        return alunoRepository.findById(id).map(aluno -> {
            alunoRepository.delete(aluno);
            return ResponseEntity.noContent().<Void>build();
        }).orElseGet(() -> ResponseEntity.notFound().build());
    }


    @GetMapping("/{id}/carga-horaria")
    public ResponseEntity<String> verificarCargaHoraria(@PathVariable Long id) {
        return alunoRepository.findById(id).map(aluno -> {
            int cumprida = aluno.getCargaHorariaCumprida();
            int obrigatoria = aluno.getCargaHorariaObrigatoria();
            String nome = aluno.getNome() != null ? aluno.getNome() : "Aluno (sem nome)";
            if (obrigatoria <= 0) {
                return ResponseEntity.ok("Carga horária obrigatória não definida para o aluno.");
            }
            if (cumprida >= obrigatoria) {
                return ResponseEntity.ok("Aluno " + nome + " já completou a carga horária.");
            } else {
                int faltando = obrigatoria - cumprida;
                return ResponseEntity.ok("Aluno " + nome + " ainda precisa de " + faltando + " horas.");
            }
        }).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
