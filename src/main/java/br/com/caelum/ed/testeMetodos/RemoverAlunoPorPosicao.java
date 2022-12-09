package br.com.caelum.ed.testeMetodos;

import br.com.caelum.ed.model.Aluno;
import br.com.caelum.ed.model.Vetor;

public class RemoverAlunoPorPosicao {
    public static void main(String[] args) {
        Aluno aluno1=new Aluno();
        Aluno aluno2=new Aluno();
        Aluno aluno3=new Aluno();
        Aluno aluno4=new Aluno();


        aluno1.setName("Pedro");
        aluno2.setName("Flavio");
        aluno3.setName("Ted");
        aluno4.setName("Bob");

        Vetor lista=new Vetor();
        lista.adicionaFimLista(aluno1);
        lista.adicionaFimLista(aluno2);
        lista.adicionaFimLista(aluno3);
        lista.adicionaFimLista(aluno4);

        lista.remove(1);
        lista.remove(0);

        System.out.println(lista);

    }
}
