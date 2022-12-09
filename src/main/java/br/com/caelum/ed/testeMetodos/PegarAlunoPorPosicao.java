package br.com.caelum.ed.testeMetodos;

import br.com.caelum.ed.model.Aluno;
import br.com.caelum.ed.model.Vetor;

public class PegarAlunoPorPosicao {

    public static void main(String[] args) {

        Aluno aluno1=new Aluno();
        Aluno aluno2=new Aluno();

        aluno1.setName("Joao");
        aluno2.setName("Flavio");

        Vetor lista=new Vetor();
        lista.adicionaFimLista(aluno1);
        lista.adicionaFimLista(aluno2);

        lista.pegaAlunoPosicao(1);
        lista.pegaAlunoPosicao(0);

    }
}
