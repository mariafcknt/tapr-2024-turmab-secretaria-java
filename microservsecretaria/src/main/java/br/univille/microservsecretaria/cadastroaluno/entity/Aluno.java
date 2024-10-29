package br.univille.microservsecretaria.cadastroaluno.entity;

import java.util.UUID;
import org.springframework.data.annotation.Id;

import com.azure.sprint.data.cosmos.core.mapping.Container;
import com.azure.sprint.data.cosmos.core.mapping.GeneratedValue;
import com.azure.sprint.data.cosmos.core.mapping.PartitionKey;

@Container(containerName = "aluno", autoCreateContainer = true)
public class Aluno {
    @Id
    @PartitionKey
    @GeneratedValue
    private UUID id;
    private String nome;

    public String getId(){
        return id;
    };

    public void setId(String id){
        this.id = id;
    };
    
    public String nome(){
        return nome;
    };

    public void setNome(String nome){
        this.nome = nome;
    };
}
