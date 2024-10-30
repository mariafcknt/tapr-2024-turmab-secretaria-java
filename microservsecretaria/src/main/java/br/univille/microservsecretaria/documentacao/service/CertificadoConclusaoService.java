package br.univille.microservsecretaria.documentacao.service;

import java.util.List;
import br.univille.microservsecretaria.documentacao.entity.CertificadoConclusao;


public interface CertificadoConclusaoService {
    
    List<CertificadoConclusao>getAll();
    CertificadoConclusao save (CertificadoConclusao certificadoconclusao);
}
