package br.edu.univille.microservcolegio.univille.microservsecretaria.controller;

import org.springframework.web.bind.annotation.RestController;

import br.edu.univille.microservcolegio.univille.microservsecretaria.cadastroaluno.entity.Aluno;
import br.edu.univille.microservcolegio.univille.microservsecretaria.service.AlunoService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/api/v1/alunos")
public class AlunoAPIController {

    @Autowired
    private AlunoService service;

    @GetMapping
    public ResponseEntity<List<Aluno>> get(){
        var listaAlunos = service.getAll();

        return new ResponseEntity<List<Aluno>>(listaAlunos,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Aluno> post(@RequestBody Aluno aluno){
        if (aluno == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        var alunoSalvo = service.save(aluno);

        return new ResponseEntity<Aluno>(alunoSalvo,HttpStatus.OK);
    }
}