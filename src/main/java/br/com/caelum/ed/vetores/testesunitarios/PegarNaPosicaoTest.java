package br.com.caelum.ed.vetores.testesunitarios;

import br.com.caelum.ed.model.Aluno;
import br.com.caelum.ed.vetores.Vetor;

public class PegarNaPosicaoTest {
    public static void main(String[] args) {

        Aluno aluno2=new Aluno();
        Aluno aluno1=new Aluno();

        aluno1.setName("Flavio");
        aluno2.setName("Sueli");

        Vetor lVetor=new Vetor();
        lVetor.adiciona(aluno1);
        lVetor.adiciona(aluno2);

        Aluno pos1 = lVetor.pega(1);
        System.out.println(pos1);

        Aluno pos3 = lVetor.pega(3);
        System.out.println(pos3);

    }
}
