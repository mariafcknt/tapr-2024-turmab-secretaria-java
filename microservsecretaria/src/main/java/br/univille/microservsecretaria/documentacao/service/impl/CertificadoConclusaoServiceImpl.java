package br.univille.microservsecretaria.documentacao.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import br.univille.microservsecretaria.documentacao.entity.CertificadoConclusao;
import br.univille.microservsecretaria.documentacao.service.CertificadoConclusaoService;

public class CertificadoConclusaoServiceImpl 
    implements CertificadoConclusaoService{


    @Autowired
    private CertificadoConclusãoRepository repository;

    @Override
    public List<CertificadoConclusao> getAll() {
        var retorno = repository.findAll();
        List<CertificadoConclusao> listaCertificados = new ArrayList<CertificadoConclusao>();
        retorno.forEach(listaCertificados::add);

        return listaCertificados;
    }

    public CertificadoConlusão save (CertificadoConclusão certificadoconlusão) {
        return repository.save(certificadoconlusão);
    }

    @Override
    public CertificadoConclusao save(CertificadoConclusao certificadoConclusao) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

}
