package br.univille.microservsecretaria.cadastroaluno.entity;

public class Aluno {
    private String nome;
    //private cursoGraduacao
    private DiplomaEscola diploma;
    private StatusAluno status;

    public Aluno(String nome, DiplomaEscola diploma, StatusAluno status) {
        this.nome = nome;
        this.diploma = diploma;
        this.status = status;
    }

}
