package br.edu.univille.microservcolegio.univille.microservsecretaria.cadastroaluno.entity;

import org.springframework.data.annotation.Id;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

@Container(containerName = "aluno", autoCreateContainer = true)
public class Aluno {
    @Id
    @PartitionKey
    @GeneratedValue
    private String id;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId(){
        return id;
    };

    public void setId(String id){
        this.id = id;
    };
    
    
}
