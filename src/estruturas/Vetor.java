package estruturas; 

public class Vetor {
    private int[] elementos;
    private int tamanho;

    public Vetor(){
        this.elementos = new int[10];
        this.tamanho = 0; 
    }

    public void adicionar(int elemento){
        if(this.tamanho == this.elementos.length){
            redimencionar();
        }
        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
    }

    private void redimencionar(){
        int[] novoVetor = new int[this.elementos.length * 2];
        for(int i = 0; i < this.elementos.length; i++){
            novoVetor[i] = this.elementos[i];
        }
        this.elementos = novoVetor;
    }

    public boolean buscaSequencial(int valor){
        for(int i = 0; i < this.tamanho; i++){
            if(this.elementos[i] == valor){
                return true;
            }
        }
        return false;
    }

    public boolean buscaBinaria(int valor){
        int inicio = 0;
        int fim = this.tamanho - 1;

        while(inicio <= fim){
            int meio = (inicio + fim) / 2;

            if(this.elementos[meio] == valor){
                return true;
            }

            if(valor < this.elementos[meio]){
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }
        return false;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public int get(int posicao){
        if(posicao < 0 || posicao >= tamanho){
            throw new IndexOutOfBoundsException("Posicao invalida!");
        }
        return this.elementos[posicao];
    }

    public void set(int posicao, int valor){
        if(posicao < 0 || posicao >= tamanho){
            throw new IndexOutOfBoundsException("Posicao invalida!");
        }
        this.elementos[posicao] = valor;
    }

    public void imprimir(){
        System.out.print("[");
        for(int i = 0; i < this.tamanho; i++){
            System.out.print(this.elementos[i] + (i < this.tamanho - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}
