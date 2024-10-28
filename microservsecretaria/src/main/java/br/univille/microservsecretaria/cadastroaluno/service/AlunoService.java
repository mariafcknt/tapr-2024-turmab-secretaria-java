package br.univille.microservsecretaria.cadastroaluno.service;

import java.util.List;

import br.univille.microservsecretaria.cadastroaluno.entity.Aluno;

public interface AlunoService {
    List<Aluno> getAll();
    Aluno save(Aluno aluno);
}
