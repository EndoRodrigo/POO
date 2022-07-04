package Ejercicio5;

public class Triangulo {

    private double base;
    private  double lado;

    public Triangulo(double base, double lado) {
        this.base = base;
        this.lado = lado;
    }

    public double obtenerPerimetro(){
        double perimetro = (base + lado) * 2;
        return perimetro;
    }

    public double obtenerArea(){
        double area =(base * Math.sqrt((lado*lado) - ((lado*lado)/4)))/2;
        return area;
    }

    public String mostrarDatos(){
        return "Base: "+base+"\nLado: "+lado+"\nPerimetro: "+obtenerPerimetro()+"\nArea: "+obtenerArea();
    }


}
