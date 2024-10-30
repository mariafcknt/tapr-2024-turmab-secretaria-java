package br.univille.microservsecretaria.documentacao.entity;

import org.springframework.data.annotation.Id;
import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import br.univille.microservsecretaria.cadastroaluno.entity.Aluno;

@Container(containerName = "certificadoConclusao", autoCreateContainer = true)
public class CertificadoConclusao {

   @Id
   @PartitionKey
   @GeneratedValue
   private String id;
   private Aluno matricula;
   //private DesempenhoAcademico desempenhoAcademico;

 
   public void emitirCertificado (){
      
   }




   
   public String getId() {
      return id;
   }


   public void setId(String id) {
      this.id = id;
   }


   public Aluno getMatricula() {
      return matricula;
   }


   public void setMatricula(Aluno matricula) {
      this.matricula = matricula;
   }


 

   

}
