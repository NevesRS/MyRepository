public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(ehPrimo(4));
    }

    public static boolean ehPrimo(int valor){
        int contDiv = 0;
        boolean ehPrimo = false;

       for (int i = valor; i > 1; i--) {
            if(valor%i == 0){
                contDiv++;
            }
        }
        if(contDiv == 1){
            ehPrimo = true;
        }
        return ehPrimo;
    }

    public static boolean verificarNumeroPerfeito(int valor) {
        int somaDivisores = 0;
        
        for (int i = 1; i < valor; i++) {
            if (valor % i == 0) {
                somaDivisores += i;
            }
        }
        
        return somaDivisores == valor;
    }

}
