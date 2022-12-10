package br.com.caelum.ed.vetores.testesunitarios;

import br.com.caelum.ed.model.Aluno;
import br.com.caelum.ed.vetores.Vetor;

public class TamanhoListaTest {
    public static void main(String[] args) {

        Aluno aluno2=new Aluno();
        Aluno aluno1=new Aluno();

        aluno1.setName("Flavio");
        aluno2.setName("Sueli");

        Vetor lVetor=new Vetor();
        lVetor.adiciona(aluno1);
        lVetor.adiciona(aluno2);
        System.out.println(lVetor);


        boolean remove1 = lVetor.remove(1);
        System.out.println(remove1);


    }
}
