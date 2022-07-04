package Ejercicio9;

public class Rectangulo extends Poligono{

    private double lado1;
    private double lado2;

    public Rectangulo(double lado1, double lado2) {
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double Area() {
        return lado1 * lado2;
    }

    @Override
    public String toString() {
        return "Rectangulo: \n"+ super.toString() +"\nLado1: "+lado1+"\nlado2: "+lado2;
    }
}
