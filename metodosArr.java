import java.util.*;

public class metodosArr {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int[] valores = new int[6];
      
        for (int i = 0; i < valores.length; i++) {
            int n = 0;
            do {
                System.out.println("Digite um valor para a posição: [" + i + "]");
                n = teclado.nextInt();
                valores[i] = n;
            } while (n < 0);
        }
    }

    public static void imprimirArr(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("[" + vetor[i] + "]");
        }
    }

    public static int[] somaArr(int[] vetor1, int[] vetor2) {
        int[] soma = new int[vetor1.length];
        for (int i = 0; i < vetor1.length; i++) {
            soma[i] = vetor1[i] + vetor2[i];
        }
        return soma;
    }

    public static int[] subArr(int[] vetor1, int[] vetor2) {
        int[] sub = new int[vetor1.length];
        for (int i = 0; i < vetor1.length; i++) {
            sub[i] = vetor1[i] - vetor2[i];
        }
        return sub;
    }

    public static int prodEscalar(int[] vetor1, int[] vetor2) {
        int soma = 0;
        for (int i = 0; i < vetor1.length; i++) {
            soma = vetor1[i] * vetor2[i] + soma;
        }
        return soma;
    }

    public static void quantParesImp(int[] vetor) {
        int quantPares = 0;
        int quantImp = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                quantPares++;
            } else {
                quantImp++;
            }
        }
        System.out.println("Quantidade pares: " + (quantPares));
        System.out.println("Quantidade impares: " + (quantImp));
    }
}
