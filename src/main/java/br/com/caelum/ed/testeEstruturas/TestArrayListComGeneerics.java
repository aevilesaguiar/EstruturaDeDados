package br.com.caelum.ed.testeEstruturas;

import br.com.caelum.ed.model.Aluno;

import java.util.ArrayList;
import java.util.Arrays;

public class TestArrayListComGeneerics {
    public static void main(String[] args) {

        //Com o generics temos uma segurança em tempo de compilação em relação a tipagem dos objetos. Se
        //tentarmos adicionar um objeto que não é do tipo Aluno um erro de compilação acontecerá.

        Aluno aluno=new Aluno();
        aluno.setName("Antonio");

        ArrayList<Aluno> alunos=new ArrayList<>();
        alunos.add(aluno);

        System.out.println(alunos);

    }
}
