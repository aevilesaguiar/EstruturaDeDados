package br.com.caelum.ed.teste;

import br.com.caelum.ed.model.Aluno;
import br.com.caelum.ed.model.Vetor;

public class AdicionaEmUmaPosicao {

    public static void main(String[] args) {

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();

        a1.setName("Rafael");
        a2.setName("Paulo");
        a3.setName("Ana");

        Vetor lista = new Vetor();
        //lista.adicionarEmUmaPosicao(a1);
        lista.adicionarEmUmaPosicao(0, a2);
        lista.adicionarEmUmaPosicao(1, a3);
        System.out.println(lista);


    }


}
