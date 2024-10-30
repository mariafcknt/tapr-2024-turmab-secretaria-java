package br.univille.microservsecretaria.cadastroaluno.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.azure.spring.data.cosmos.repository.CosmosRepository;

import br.univille.microservsecretaria.cadastroaluno.entity.*;

@Repository
public interface AlunoRepository 
    extends CrudRepository<Aluno,String>{
    
}