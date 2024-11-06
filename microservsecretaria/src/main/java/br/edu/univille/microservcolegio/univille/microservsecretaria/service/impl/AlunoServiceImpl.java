package br.edu.univille.microservcolegio.univille.microservsecretaria.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.univille.microservcolegio.univille.microservsecretaria.cadastroaluno.entity.Aluno;
import br.edu.univille.microservcolegio.univille.microservsecretaria.repository.AlunoRepository;
import br.edu.univille.microservcolegio.univille.microservsecretaria.service.AlunoService;

import java.util.List;
import java.util.ArrayList;

@Service
public class AlunoServiceImpl 
    implements AlunoService{

    @Autowired
    private AlunoRepository repository;
    
    @Override
    public List<Aluno> getAll(){
        var retorno = repository.findAll();
        List<Aluno> listaAlunos = new ArrayList<Aluno>();
        retorno.forEach(listaAlunos::add);
        return listaAlunos;
    }
    

    @Override
    public Aluno save(Aluno aluno){
        return repository.save(aluno);
        }

};