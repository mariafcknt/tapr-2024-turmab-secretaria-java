package br.univille.microservsecretaria.documentacao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.univille.microservsecretaria.documentacao.entity.CertificadoConclusao;
import br.univille.microservsecretaria.documentacao.service.CertificadoConclusaoService;

@RestController
@RequestMapping("/api/v1/certificados")
public class APIController {
    
    @Autowired
    private CertificadoConclusaoService service;

    @GetMapping
    public ResponseEntity<List<CertificadoConclusao>>get(){
        var listaCertificados = service.getAll();
        return new ResponseEntity<List<CertificadoConclusao>>(listaCertificados, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CertificadoConclusao> post(@RequestBody CertificadoConclusao certificadoconlusão){
        if(certificadoconlusão == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        var certificadoSalvo = service.save(certificadoconlusão);

        return new ResponseEntity<CertificadoConclusao>(certificadoSalvo, HttpStatus.OK);
    }
    @PutMapping ("/{id}")
    public ResponseEntity<CertificadoConclusao> put(@PathVariable("id")String id, @RequestBody CertificadoConclusao certificadoconclusao){
        if (certificadoconclusao == null || id == "" || id == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        certificadoconclusao = service.update(id, certificadoconclusao);
        if (certificadoconclusao == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }return new ResponseEntity<CertificadoConclusao>(certificadoconclusao, HttpStatus.OK);
    }


}


