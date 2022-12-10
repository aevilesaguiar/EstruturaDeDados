package br.com.caelum.ed.vetores.testesunitarios;

import br.com.caelum.ed.model.Aluno;
import br.com.caelum.ed.vetores.Vetor;

public class AdicionaNaPosicaoTest {

    public static void main(String[] args) {

        Aluno aluno2=new Aluno();
        Aluno aluno1=new Aluno();

        aluno1.setName("Flavio");
        aluno2.setName("Sueli");

        Vetor lVetor=new Vetor();

        lVetor.adiciona(1,aluno1);
        lVetor.adiciona(2,aluno2);




    }
}
