package br.univille.microservsecretaria.cadastroaluno.entity;

public class StatusAluno {
    private String status;

    public StatusAluno(String status) throws Exception {
        String listaStatus[] = {"Regular, Irregular, Trancado"};
        for (int i = 0; i <= listaStatus.length; i++) {
            if (status == listaStatus[i]) {
                this.status = status;
            } else {
                throw new Exception("Status inválido! Status válidos: Regular, Irregular e Trancado");
            }
        }
    }

    public String getStatus() {
        return status;
    }
}

//matriculado, regular, irregular