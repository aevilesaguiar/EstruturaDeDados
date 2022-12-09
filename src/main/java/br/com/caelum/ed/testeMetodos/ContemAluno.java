package br.com.caelum.ed.testeMetodos;

import br.com.caelum.ed.model.Aluno;
import br.com.caelum.ed.model.Vetor;

public class ContemAluno {
    public static void main(String[] args) {

        Aluno aluno1=new Aluno();
        Aluno aluno2=new Aluno();

        aluno1.setName("Ana");
        aluno2.setName("Gabriel");

        Vetor lista= new Vetor();
        lista.adicionaFimLista(aluno1);
        lista.adicionaFimLista(aluno2);


        System.out.println(lista.contem(aluno1));
        System.out.println(lista.contem(aluno2));

        Aluno aluno3=new Aluno();
        aluno3.setName("Francisco");

        System.out.println(lista.contem(aluno3));


    }
}
