package Fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacciIterativo(17));
        System.out.println(fibonacciRecursivo(16));
    }

    public static int fibonacciIterativo(int n) {
        int n1 = 1;
        int n2 = 1;
        int soma = 0;
        for (int i = 0; i < n; i++) {
            n2 = n1;
            n1 = soma;
            soma = n1 + n2;
        }
        return soma;
    }

    public static int fibonacciRecursivo(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n-2);
        }
    }
}
