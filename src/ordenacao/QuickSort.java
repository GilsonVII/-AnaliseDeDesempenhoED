package ordenacao;

import estruturas.Vetor;

public class QuickSort {

    public void ordenar(Vetor vetor) {
        quickSort(vetor, 0, vetor.getTamanho() - 1);
    }

    private void quickSort(Vetor vetor, int inicio, int fim) {
        if (inicio < fim) {
            int indicePivo = particionar(vetor, inicio, fim);

            quickSort(vetor, inicio, indicePivo - 1);

            quickSort(vetor, indicePivo + 1, fim);
        }
    }

    private int particionar(Vetor vetor, int inicio, int fim) {
        int pivo = vetor.get(fim);
        int i = (inicio - 1);

        for (int j = inicio; j < fim; j++) {
            if (vetor.get(j) < pivo) {
                i++;
             
                int temp = vetor.get(i);
                vetor.set(i, vetor.get(j));
                vetor.set(j, temp);
            }
        }

        int temp = vetor.get(i + 1);
        vetor.set(i + 1, vetor.get(fim));
        vetor.set(fim, temp);

        return i + 1; 
    }
}