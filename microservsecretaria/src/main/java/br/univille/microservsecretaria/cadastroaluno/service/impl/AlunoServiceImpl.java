package br.univille.microservsecretaria.cadastroaluno.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.microservsecretaria.cadastroaluno.entity.Aluno;
import br.univille.microservsecretaria.cadastroaluno.repository.AlunoRepository;
import br.univille.microservsecretaria.cadastroaluno.service.AlunoService;

@Service
public class AlunoServiceImpl implements AlunoService {
    @Autowired
    private AlunoRepository repository;

    @Override
    public List<Aluno> getAll() {
        var retorno = repository.findAll();
        List<Aluno> listaAlunos = new ArrayList<Aluno>();
        retorno.forEach(listaAlunos::add);
        return listaAlunos;
    }

    @Override
    public Aluno save(Aluno aluno) {
        return repository.save(aluno);
    }
    
}
