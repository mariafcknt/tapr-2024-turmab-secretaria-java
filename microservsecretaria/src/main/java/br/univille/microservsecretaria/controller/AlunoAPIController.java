package br.univille.microservsecretaria.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import br.univille.microservsecretaria.service.AlunoService;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@Restmapping("/api/v1/alunos")
public class AlunoAPIController {

    @Autowired
    private AlunoService service;

    @GetMapping
    public ResponseEntity<List<Aluno>> get(){
        var listaAlunos = service.getAll();

        return new ResponseEntity<List<Aluno>>(listaAlunos,HttpStatus.OK);
    }
}