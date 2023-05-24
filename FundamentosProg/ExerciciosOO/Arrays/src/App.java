import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int[] valores1 = {0,1,0,1,0};
        int[] valores2 = {2,3,4,5,6};

        // System.out.println(produtoEscalarVetores(valores1, valores2));
        // System.out.println(somaDosValoresVetor(valores1, valores2));
        // System.out.println(maiorValorVetor(valores1));
        // System.out.println(menorValorVetor(valores1));
        // subratacaoDeVetores(valores1, valores2);
        testePar(valores1);

        teclado.close();
    }

    public static int somaDosValoresVetor(int[] valores1, int[] valores2){
        int somaValores1 = 0;
        int somaValores2 = 0;

        for(int i = 0; i < valores1.length; i++){
            somaValores1 = somaValores1 + valores1[i];
        }
        for(int i = 0; i < valores1.length; i++){
            somaValores2 = somaValores2 + valores2[i];
        }

        return (somaValores1+somaValores2);
    }

    public static int produtoEscalarVetores(int[] valores1, int[] valores2){
        int multValores1 = 1;
        int multValores2 = 1;

        for(int i = 0; i < valores1.length; i++){
            multValores2 = multValores1 + valores1[i];
        }
        for(int i = 0; i < valores1.length; i++){
            multValores2 = multValores2 + valores2[i];
        }

        return (multValores1*multValores2);
    }

    public static void subratacaoDeVetores(int[] valores1, int[] valores2){
        //Subtrai v1[0] - v2[0] -> armazena isso no v3[0]

        for(int i = 0; i < valores1.length; i++){
            int[] valores3 = new int [i+1];
            valores3[i] = valores1[i] - valores2[i];
            System.out.print("["+valores3[i]+"]");
        }
    }

    public static int maiorValorVetor(int[] valores1){
        int aux = valores1[0];
        for(int i = 0; i < valores1.length; i++){
            if(aux <= valores1[i]){
                aux = valores1[i];
            } 
        }
        return aux;
    }

    public static int menorValorVetor(int[] valores1){
        int aux = valores1[0];
        for(int i = 0; i < valores1.length; i++){
            if(aux >= valores1[i]){
                aux = valores1[i];
            } 
        }
        return aux;
    }

    public static void testePar(int[] valores1){
        int cont = 0;
        for(int i = 0; i < valores1.length; i++){
            cont++;
            if(cont%2 == 0){
                valores1[i] = -2;
                System.out.print("["+valores1[i]+"]");
            }else{
                valores1[i] = -1;
                System.out.print("["+valores1[i]+"]");
            }
            //
        }
    }
}
