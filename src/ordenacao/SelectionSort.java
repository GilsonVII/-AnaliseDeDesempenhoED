package ordenacao;

import estruturas.Vetor;

public class SelectionSort {
    public void ordenar(Vetor vetor){
        int n = vetor.getTamanho();
        
        System.out.println("--> Iniciando ordenação de " + n + " elementos...");

        for(int i = 0; i < n - 1; i++){
            int indiceMenor = i;

            for(int j = i + 1; j < n; j++){ 
                if(vetor.get(j) < vetor.get(indiceMenor)){
                    indiceMenor = j;
                }
            }
            
            if(indiceMenor != i){
                int temp = vetor.get(i);
                vetor.set(i, vetor.get(indiceMenor));
                vetor.set(indiceMenor, temp);
            }
        }
    }
}
