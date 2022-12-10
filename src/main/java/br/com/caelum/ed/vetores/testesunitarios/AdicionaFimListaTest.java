package br.com.caelum.ed.vetores.testesunitarios;

import br.com.caelum.ed.model.Aluno;
import br.com.caelum.ed.vetores.Vetor;

public class AdicionaFimListaTest {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();

        aluno1.setName("Flavio");
        aluno2.setName("Sueli");
        aluno3.setName("Inez");

        Vetor lVetor=new Vetor();

        lVetor.adiciona(aluno3);
        lVetor.adiciona(0,aluno1);
        lVetor.adiciona(1,aluno2);
    }
}
