package main;

import estruturas.Vetor;
import ordenacao.SelectionSort;
import ordenacao.QuickSort;
import estruturas.ArvoreBinaria;
import estruturas.ArvoreAVL;

public class Programa {
    public static void main(String[] args) {
        /* 
        // VETOR

        int TAMANHO = 100;
         //int[] dadosBase = GeradorDados.gerarOrdenado(TAMANHO);
         //int[] dadosBase = GeradorDados.gerarInverso(TAMANHO);
         int[] dadosBase = GeradorDados.gerarAleatorio(TAMANHO); 

        System.out.println("=== RELATÓRIO DE PERFORMANCE: VETOR ===");
        System.out.println("Tamanho: " + TAMANHO);
        
        long somaInsercao = 0;
        Vetor vetorParaBusca = new Vetor();

        for (int i = 0; i < 5; i++) {
            Vetor v = new Vetor();
            long inicio = System.nanoTime();
            for (int val : dadosBase) {
                v.adicionar(val);
            }
            long fim = System.nanoTime();
            somaInsercao += (fim - inicio);
            
            if (i == 0) vetorParaBusca = v;
        }
        System.out.println("Média Inserção: " + (somaInsercao / 5) + " ns");

        long somaBusca = 0;
        int alvoInexistente = -1;

        for (int i = 0; i < 5; i++) {
            long inicio = System.nanoTime();
            vetorParaBusca.buscaSequencial(alvoInexistente);
            long fim = System.nanoTime();
            somaBusca += (fim - inicio);
        }
        System.out.println("Média Busca Sequencial (Inexistente): " + (somaBusca / 5) + " ns");

        long somaSelection = 0;
        for(int i=0; i<5; i++){
            Vetor vSel = carregarVetor(dadosBase); 
            long inicio = System.currentTimeMillis();
            new SelectionSort().ordenar(vSel);
            long fim = System.currentTimeMillis();
            somaSelection += (fim - inicio);
        }
        System.out.println("Média Selection Sort: " + (somaSelection / 5) + " ms");

        long somaQuick = 0;
        for(int i=0; i<5; i++){
            Vetor vQuick = carregarVetor(dadosBase);
            long inicio = System.nanoTime();
            new QuickSort().ordenar(vQuick);
            long fim = System.nanoTime();
            somaQuick += (fim - inicio);
        }
        System.out.println("Média Quick Sort: " + (somaQuick / 5) + " ns");
    }

    private static Vetor carregarVetor(int[] dados) {
        Vetor v = new Vetor();
        for (int d : dados) {
            v.adicionar(d);
        }
        return v;
    }
       */ 
      
    
        /* 
        // ÁRVORE BINÁRIA

        int TAMANHO = 100;
        
        int[] dadosBase = GeradorDados.gerarOrdenado(TAMANHO);
        //int[] dadosBase = GeradorDados.gerarInverso(TAMANHO);
        //int[] dadosBase = GeradorDados.gerarAleatorio(TAMANHO);

        System.out.println("=== TESTE DE PERFORMANCE: ÁRVORE BINÁRIA (ABB) ===");
        System.out.println("Tamanho: " + TAMANHO);

        long somaInsercao = 0;
        ArvoreBinaria arvoreParaBusca = new ArvoreBinaria(); 

        for (int i = 0; i < 5; i++) {
            ArvoreBinaria arvore = new ArvoreBinaria();
            long inicio = System.nanoTime();
            for (int val : dadosBase) {
                arvore.inserir(val);
            }
            long fim = System.nanoTime();
            somaInsercao += (fim - inicio);
            
            if (i == 0) arvoreParaBusca = arvore;
        }
        System.out.println("Média Inserção: " + (somaInsercao / 5) + " ns");

        long somaBusca = 0;
        int alvoInexistente = -1; 

        for (int i = 0; i < 5; i++) {
            long inicio = System.nanoTime();
            arvoreParaBusca.buscar(alvoInexistente);
            long fim = System.nanoTime();
            somaBusca += (fim - inicio);
        }
        System.out.println("Média Busca (Inexistente): " + (somaBusca / 5) + " ns");
        
        System.out.println("--------------------------------------------------");
        System.out.println("DICA: Se der erro 'StackOverflow' com dados ORDENADOS,");
        System.out.println("é porque a árvore virou uma lista gigante. Isso é esperado!");
    }
    
    */
    
    //ÁRVORE AVL

     
     int TAMANHO = 100; 
        
        // int[] dadosBase = GeradorDados.gerarOrdenado(TAMANHO);
        // int[] dadosBase = GeradorDados.gerarInverso(TAMANHO);
         int[] dadosBase = GeradorDados.gerarAleatorio(TAMANHO);

        System.out.println("=== TESTE DE PERFORMANCE: ÁRVORE AVL ===");
        System.out.println("Tamanho: " + TAMANHO);

        long somaInsercao = 0;
        ArvoreAVL arvoreParaBusca = new ArvoreAVL();

        for (int i = 0; i < 5; i++) {
            ArvoreAVL arvore = new ArvoreAVL();
            long inicio = System.nanoTime(); 
            for (int val : dadosBase) {
                arvore.inserir(val);
            }
            long fim = System.nanoTime();
            somaInsercao += (fim - inicio);
            
            if (i == 0) arvoreParaBusca = arvore;
        }
        System.out.println("Média Inserção: " + (somaInsercao / 5) + " ns");

        long somaBusca = 0;
        int alvoInexistente = -1;

        for (int i = 0; i < 5; i++) {
            long inicio = System.nanoTime();
            arvoreParaBusca.buscar(alvoInexistente);
            long fim = System.nanoTime();
            somaBusca += (fim - inicio);
        }
        System.out.println("Média Busca (Inexistente): " + (somaBusca / 5) + " ns");
    }

}