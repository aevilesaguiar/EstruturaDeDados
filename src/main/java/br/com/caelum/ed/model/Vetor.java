package br.com.caelum.ed.model;

public class Vetor {

    private Aluno[] objects =new Aluno[100];

    private int totalDeObjetos =0;

    private void garanteEspaço(){
        if(this.totalDeObjetos ==this.objects.length){
            Aluno[] novaArray= new Aluno[this.objects.length*2];
            for (int i = 0; i <this.objects.length ; i++) {
                novaArray[i]=this.objects[i];
            }
            this.objects =novaArray;
        }
    }

    public void adicionaFimLista(Aluno aluno){

        this.objects[this.totalDeObjetos]=aluno;
        this.totalDeObjetos++;

        }

        private boolean posicaoValida(int posicao){

        return posicao>=0 && posicao<=this.totalDeObjetos;
        }

// Só podemos adicionar um aluno em alguma posição que já estava
//ocupada ou na primeira posição vazia da Lista.
    public void adicionarEmUmaPosicao(int posicao, Aluno aluno){
        this.garanteEspaço();

        if(!this.posicaoValida(posicao)){
            throw new IllegalArgumentException("Posição Inválida");
        }

        for (int i = this.totalDeObjetos -1; i >=posicao ; i--) {
            this.objects[i+1]=this.objects[i];
        }

        this.objects[posicao]=aluno;
        this.totalDeObjetos++;

    }

    private boolean posicaoOcupada(int posicao){
        return posicao>=0 && posicao < this.totalDeObjetos;
    }

    public Aluno pegaAlunoPosicao(int posicao) {

        if(!this.posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição Inválida");
        }
        return this.objects[posicao];
    }
    public void remove(int posicao){

        if (!posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição Inválida");
        }

        for (int i = posicao; i < this.totalDeObjetos -1; i++) {
            this.objects[i]=this.objects[i+1];
        }
        this.totalDeObjetos--;

    }

    public boolean contem(Aluno aluno){

        for (int i = 0; i < totalDeObjetos; i++) {
            if(aluno.equals(this.objects[i])){
                return true;
            }

        }
        return false;
    }

    public int tamanho(){
        return this.totalDeObjetos;
    }

    public String toString(){
        if (this.totalDeObjetos ==0){
            return "[]";
        }

        StringBuilder builder=new StringBuilder();
        builder.append("[");
        for (int i = 0; i <this.totalDeObjetos; i++) {
            builder.append(this.objects[i]);
            builder.append(",");
        }

        builder.append(this.objects[this.totalDeObjetos -1]);
        builder.append("]");

        return builder.toString();
    }


}
