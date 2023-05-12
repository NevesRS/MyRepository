public class App {
    public static void main(String[] args) throws Exception {
        Triangulo triangulo = new Triangulo(3, 2, 3);
        Retangulo retangulo = new Retangulo(2, 3);
        Data data = new Data(32, 11, 2000);

        // System.out.println("1A) "+retangulo.areaRetangulo());
        // System.out.println("1B) "+retangulo.perimetroRetangulo());
        // System.out.println("1C) "+retangulo.comprimentoDiagonal());

        // System.out.println("B1) "+triangulo.tipoTriangulo());
        // System.out.println("B2) "+ triangulo.areaTriangulo());
        // System.out.println("B3) "+triangulo.perimetroTriangulo());

        System.out.println(data.mesExtensto());
        System.out.println(data.testeBissexto()== true ? "É um ano bissexto" : "Não é um ano bissexto");
        System.out.println(data.validarData() == true ? "É uma data válida" : "É uma data invalida" );
        System.out.println(data.validarData() == true ? data.getDia()+"/"+data.getMes()+"/"+data.getAno()+" "+ data.ehFinados(): "É uma data inválida!");
    }
}
