public class BubbleSort {
    public static void main(String[] args) {
        int[] vetor = { 5, 3, 4, 2, 1 };
        int contador = 1;
        int aux = -1;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > vetor[contador]) {
                aux = vetor[i];
                vetor[i] = vetor[contador];
                vetor[contador] = aux;
                if (contador != vetor.length - 1) {
                    contador++;
                }
            }
        }

        for (int i = 0; i < vetor.length; i++) {
           System.out.print(vetor[i]+", ");
        }
    }
}