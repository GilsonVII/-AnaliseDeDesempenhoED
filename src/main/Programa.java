package main;

import estruturas.Vetor;
import ordenacao.SelectionSort;

public class Programa {
    public static void main(String[] args){
        System.out.println("=== TESTE DE ORDENAÇÃO: SELECTION SORT ===");
        
        Vetor meuVetor = new Vetor();
        
        System.out.println("Adicionando: 50, 10, 30, 5, 20");
        meuVetor.adicionar(50);
        meuVetor.adicionar(10);
        meuVetor.adicionar(30);
        meuVetor.adicionar(5);
        meuVetor.adicionar(20);
        
        System.out.print("Vetor ANTES:   ");
        meuVetor.imprimir();
        
        SelectionSort sorter = new SelectionSort();
        
        long inicio = System.nanoTime();
        sorter.ordenar(meuVetor);
        long fim = System.nanoTime();
        
        System.out.print("Vetor DEPOIS:  ");
        meuVetor.imprimir();
        
        System.out.println("Tempo gasto: " + (fim - inicio) + " nanosegundos");
        
        System.out.println("\n--------------------------------");
        System.out.println("Conclusão do Teste:");
        if (meuVetor.get(0) == 5 && meuVetor.get(4) == 50) {
            System.out.println("✅ SUCESSO! O vetor tá ordenadinho.");
        } else {
            System.out.println("❌ DEU RUIM! A ordenação falhou.");
        }
    }
}