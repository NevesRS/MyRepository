public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1Param, double lado2Param, double lado3Param) {
        lado1 = lado1Param;
        lado2 = lado2Param;
        lado3 = lado3Param;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado1(double lado1Param) {
        lado1 = lado1Param;
    }

    public void setLado2(double lado2Param) {
        lado2 = lado2Param;
    }

    public void setLado3(double lado3Param) {
        lado3 = lado3Param;
    }

    public String tipoTriangulo() {
        String tipoTriangulo = "";
        if (getLado1() == getLado2() || getLado1() == getLado3()) {
            tipoTriangulo = "Isósceles";
        }
        if (getLado1() == getLado2() && getLado3() == getLado2()) {
            tipoTriangulo = "Equilatero";
        }
        if (getLado1() != getLado2() && getLado1() != getLado3()) {
            tipoTriangulo = "Escaleno";
        }
        return tipoTriangulo;
    }

    public double areaTriangulo() {
        double area = 0;
        if (tipoTriangulo() == "Equilatero") {
            area = (Math.pow(getLado1(), 2) * Math.sqrt(3))/4;
        } else {
            double h = 0;
            double b = 0;
            if (tipoTriangulo() == "Isósceles") {
                if (getLado2() == getLado1()) {
                    h = Math.pow(getLado2(), 2) - (getLado3() / 2);
                    b = getLado3();
                }
                if (getLado2() == getLado3()) {
                    h = Math.pow(getLado2(), 2) - (getLado1() / 2);
                    b = getLado1();
                }
                area = (b * h) / 2;
            }
            if(tipoTriangulo() == "Escaleno"){
                area = 0.1;
            }
        }

        return area;
    }

    public double perimetroTriangulo() {
        return getLado1() + getLado2() + getLado3();
    }

}
