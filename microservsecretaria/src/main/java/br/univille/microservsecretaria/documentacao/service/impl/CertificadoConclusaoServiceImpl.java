package br.univille.microservsecretaria.documentacao.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.microservsecretaria.documentacao.entity.CertificadoConclusao;
import br.univille.microservsecretaria.documentacao.repository.CertificadoConclusaoRepository;
import br.univille.microservsecretaria.documentacao.service.CertificadoConclusaoService;

@Service
public class CertificadoConclusaoServiceImpl 
    implements CertificadoConclusaoService {


    @Autowired
    private CertificadoConclusaoRepository repository;

    @Override
    public List<CertificadoConclusao> getAll() {
        var retorno = repository.findAll();
        List<CertificadoConclusao> listaCertificados = new ArrayList<CertificadoConclusao>();
        retorno.forEach(listaCertificados::add);

        return listaCertificados;
    }

    public CertificadoConclusao save (CertificadoConclusao certificadoconclusao) {
        return repository.save(certificadoconclusao);
    }

    

}
