package br.univille.microservsecretaria.cadastroaluno.entity;

import org.springframework.data.annotation.Id;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

@Container(containerName = "aluno", autoCreateContainer = true)
public class Aluno {
    @Id
    @PartitionKey
    @GeneratedValue
    private String matricula;
    private String nome;

    
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

/*
    //private cursoGraduacao
    private DiplomaEscola diploma;
    private StatusAluno status;

    public Aluno(String nome, DiplomaEscola diploma, StatusAluno status) {
        this.nome = nome;
        this.diploma = diploma;
        this.status = status;
    }
*/

}
