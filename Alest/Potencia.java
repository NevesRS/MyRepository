public class Potencia {
    public static void main(String[] args) {
        System.out.println(potenciaIterativo(2, 10));
    }

    public static int potenciaIterativo(int base, int expoente){
        int retorno = 1;
        for(int i = 0; i < expoente; i++){
            retorno *= base;
        }
        return retorno;
    }
}
