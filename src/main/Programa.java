package main;

import estruturas.ArvoreAVL;
import estruturas.ArvoreBinaria;
import estruturas.Vetor;
import ordenacao.QuickSort;
import ordenacao.SelectionSort;

public class Programa {
    public static void main(String[] args){
        //========================Selection Sort===========================
        //Testes do Vetor
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
            System.out.println("SUCESSO! O vetor está ordenado.");
        } else {
            System.out.println("ERRO! A ordenação falhou.");
        }

        //Testes da Árvore Binária
        System.out.println("=== TESTE DE ÁRVORE BINÁRIA (ABB) ===");
        
        ArvoreBinaria arvore = new ArvoreBinaria();
    
        System.out.println("Inserindo elementos...");
        arvore.inserir(50);
        arvore.inserir(30);
        arvore.inserir(20);
        arvore.inserir(40);
        arvore.inserir(70);
        arvore.inserir(60);
        arvore.inserir(80);
        
        System.out.print("Árvore em ordem (deve sair ordenado): ");
        arvore.imprimirInOrder();
        
        System.out.println("\nBuscando o número 40 (Existe): " + arvore.buscar(40));
        System.out.println("Buscando o número 99 (Não existe): " + arvore.buscar(99));

        //Testes da Árvore AVL 
        System.out.println("=== TESTE DE ÁRVORE AVL (BALANCEADA) ===");
        
        ArvoreAVL avl = new ArvoreAVL();
        
        System.out.println("Inserindo: 1, 2, 3, 4, 5...");
        avl.inserir(3);
        avl.inserir(2);
        avl.inserir(1);
        avl.inserir(5);
        avl.inserir(4); 
        
        System.out.print("AVL em Ordem: ");
        avl.imprimirInOrder();
    
        System.out.println("\nBusca pelo 1: " + avl.buscar(1));
        System.out.println("Busca pelo 5: " + avl.buscar(5));

        //=========================Quick Sort================================
        System.out.println("=== TESTE DE ORDENAÇÃO DE VETOR: QUICK SORT ===");
        
        Vetor meuVetorQK = new Vetor();
        
        // Dados bagunçados
        System.out.println("Adicionando: 50, 10, 30, 5, 20");
        meuVetorQK.adicionar(50);
        meuVetorQK.adicionar(10);
        meuVetorQK.adicionar(30);
        meuVetorQK.adicionar(5);
        meuVetorQK.adicionar(20);
        
        System.out.print("Antes: ");
        meuVetor.imprimir();
        
        QuickSort qs = new QuickSort();
        qs.ordenar(meuVetorQK);
        
        System.out.print("Depois: ");
        meuVetorQK.imprimir();
        
        if (meuVetorQK.get(0) == 5 && meuVetorQK.get(4) == 50) {
            System.out.println("SUCESSO! QuickSort funcionou.");
        } else {
            System.out.println("Falhou! Vetor não ordenou.");
        }
    }
}