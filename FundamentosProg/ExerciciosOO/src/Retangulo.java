public class Retangulo {
    private double base;
    private double altura;
    
    public Retangulo(double baseParam, double alturaParam){
        base = baseParam;
        altura = alturaParam;
    }

    public double getBase(){ return base;}
    public double getAltura(){ return altura;}

    public void setBase(double baseParam){ base = baseParam;}
    public void setAltura(double alturaParam){ altura = alturaParam;}

    public double areaRetangulo(){
        return getBase() * getAltura(); 
    }
    public double perimetroRetangulo(){
        return 2*(getBase() + getAltura());
    }
    public double comprimentoDiagonal(){
        return Math.sqrt(Math.pow(getBase(), 2)+Math.pow(getAltura(), 2)); 
    }
}
