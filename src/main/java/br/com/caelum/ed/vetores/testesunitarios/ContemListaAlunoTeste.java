package br.com.caelum.ed.vetores.testesunitarios;

import br.com.caelum.ed.model.Aluno;
import br.com.caelum.ed.vetores.Vetor;

public class ContemListaAlunoTeste {
    public static void main(String[] args) {

        Aluno aluno2=new Aluno();
        Aluno aluno1=new Aluno();
        Aluno aluno3=new Aluno();
        Aluno aluno4=new Aluno();

        aluno1.setName("Flavio");
        aluno2.setName("Sueli");
        aluno3.setName("João");
        aluno4.setName("Felipe");

        Vetor lVetor=new Vetor();
        lVetor.adiciona(aluno1);
        lVetor.adiciona(aluno2);
        System.out.println(lVetor);

        int tamanho = lVetor.tamanho();
        System.out.println(lVetor.contem(aluno1));
        System.out.println(lVetor.contem(aluno2));
        System.out.println(lVetor.contem(aluno3));
        System.out.println(lVetor.contem(aluno4));

        System.out.println(lVetor.tamanho());


    }
}
