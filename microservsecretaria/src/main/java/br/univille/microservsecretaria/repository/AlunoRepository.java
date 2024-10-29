package br.univille.microservsecretaria.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.azure.spring.data.cosmos.repository.CosmosRepository;

import br.univille.microservsecretaria.entity.Aluno;

@Repository
public interface AlunoRepository
    extends CrudRepository<Aluno,String>{

    };