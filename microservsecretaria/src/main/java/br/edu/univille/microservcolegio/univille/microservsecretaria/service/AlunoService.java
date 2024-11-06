package br.edu.univille.microservcolegio.univille.microservsecretaria.service;

import java.util.List;

import br.edu.univille.microservcolegio.univille.microservsecretaria.cadastroaluno.entity.Aluno;

public interface AlunoService{
    List<Aluno>getAll();
    Aluno save(Aluno aluno);
}