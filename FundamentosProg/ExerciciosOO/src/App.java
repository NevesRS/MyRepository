public class App {
    public static void main(String[] args) throws Exception {
        Triangulo triangulo = new Triangulo(3, 2, 3);
        Retangulo retangulo = new Retangulo(2, 3);
        System.out.println("1A) "+retangulo.areaRetangulo());
        System.out.println("1B) "+retangulo.perimetroRetangulo());
        System.out.println("1C) "+retangulo.comprimentoDiagonal());

        System.out.println("B1) "+triangulo.tipoTriangulo());
        System.out.println("B2) "+ triangulo.areaTriangulo());
        System.out.println("B3) "+triangulo.perimetroTriangulo());
    }
}
