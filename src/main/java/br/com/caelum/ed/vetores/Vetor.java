package br.com.caelum.ed.vetores;

import br.com.caelum.ed.model.Aluno;

import java.util.Arrays;

public class Vetor {

    //declarando e inicializando um array de  aluno com capacidade 100
    private Aluno[] alunos=new Aluno[100000];

    private int totalDeAlunos=0;

    public int tamanho(){
        return this.totalDeAlunos;
    }
    public void adiciona(Aluno aluno){

        this.alunos[this.totalDeAlunos]=aluno;
        this.totalDeAlunos++;

    }

    public boolean contem(Aluno aluno){

        for (int i = 0; i <this.totalDeAlunos; i++) {//ele não precis percorrer a lista inteira apenas onde está o ultimo elemento inserido
            if (aluno.equals(this.alunos[i])){
                return true;

            };

        }
        return false;
    }

    public void adiciona(int posicao, Aluno aluno){

    }

    public boolean posicaoOcupada(int posicao){
        return posicao>=0 && posicao<this.totalDeAlunos;//menor que o total de alunos por que o vetor é contado apartir da posicão 0
    }

    public Aluno pega(int posicao){

        if (!posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição Inválida");
        }
        return this.alunos[posicao];
    }

    public boolean remove(int posicao){

        return false;
    }





    @Override
    public String toString() {
        if(this.totalDeAlunos==0){
            return "[]";
        }
        StringBuilder sb=new StringBuilder();
        sb.append("[");

        for (int i = 0; i <totalDeAlunos ; i++) {
            sb.append(this.alunos[i]);
            sb.append(", ");
            sb.append(this.alunos[this.totalDeAlunos-1]);
            sb.append("]");
        }
        return sb.toString();
    }
}
