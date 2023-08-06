public class BubbleSort2 {
    public static void main(String[] args) {
        int[] vetor = { 5, 3, 4, 2, 1 };

        boolean troca;

        do {
            troca = false;

            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    // Troca os elementos de posição
                    int aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    troca = true; // Marca que houve uma troca nesta iteração
                }
            }

        } while (troca); // Repete o processo se houver trocas na iteração anterior

        // Imprime o vetor ordenado
        for (int j = 0; j < vetor.length; j++) {
            System.out.print("[" + vetor[j] + "]");
        }
    }
}
