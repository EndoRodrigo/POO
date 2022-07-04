package Ejercicio1;

public class Cuadrilatero {

    // Atributos
    private float lado1;
    private float lado2;

    // Metodos

    // Metodo constructor de la clase cuadrilatero
    public Cuadrilatero(float lado1, float lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    // Metodo constructor de la clase cuadrilatero
    public Cuadrilatero(float lado1){
        this.lado2 = this.lado1 = lado1;
    }

    public float getPerimmetro(){
        float perimetro = 2 * (lado1 + lado2);
        return perimetro;
    }

    public float getArea(){
        float area = lado1 * lado2;
        return area;
    }


}
