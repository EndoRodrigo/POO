package Ejercicio6;

public class NumeroComplejo {
    // Ejemplo : 4 + 5i
    private double a; // parte real
    private double b;// parte imaginaria

    public NumeroComplejo(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
    /*
    * Ejemple de como suma numeros reales
    * numero1: 3 + 4i
    * numero2: 2 + 5i
    * suma: 5 + 9i
    * */

    public NumeroComplejo calcularSuma(NumeroComplejo c){
        NumeroComplejo suma = new NumeroComplejo(a+c.getA(), b + c.getB());
        return suma;
    }

    public NumeroComplejo calcularProducto(NumeroComplejo c){
        NumeroComplejo mult = new NumeroComplejo((a*c.getA() - b * c.getB()),a * c.getB() - b + c.getA());
        return mult;
    }
    public boolean calcularIgualdad(NumeroComplejo c){
        boolean igual = false;
        if (a == c.getA() && b == c.getB()){
            igual = true;
        }
        return igual;
    }
    public NumeroComplejo multiplicarPorEntero(int x){
        NumeroComplejo mult = new NumeroComplejo(a * x, b + x);
        return mult;
    }
}
