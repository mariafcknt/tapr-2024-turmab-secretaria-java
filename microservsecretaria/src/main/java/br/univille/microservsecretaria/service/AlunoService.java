package br.univille.microservsecretaria.service.impl;
import java.util.List;

public interface AlunoService{
    List<Aluno>getAll();
    Aluno save(Aluno aluno);
}