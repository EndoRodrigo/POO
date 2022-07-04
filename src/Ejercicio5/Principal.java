package Ejercicio5;

import java.util.Scanner;

public class Principal {

    public static int mayorSuperficie(Triangulo tr[]){
        double area = tr[0].obtenerArea();
        int index = 0;
        for (int i = 1; i < tr.length; i++) {
            if (tr[i].obtenerArea() > area) {
                area = tr[i].obtenerArea();
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        // Diseñar un programa para trabajar con triangulos isoseles
        // para ellos definan los atributos necesarios que se requieren
        // proporcione metodos de consult a un metodo constructor
        // e implemente un metodo para calcullar el perimetro y area de un triangulo
        // ademas implementar un metodo que aprtir de un triangulo devuelva el area
        // del triangulo con mayor superficie

        Scanner sc = new Scanner(System.in);
        double lado, base;
        int numero;

        System.out.println("Ingrese el numero de triangulos a registrar: ");
        numero = sc.nextInt();

        Triangulo tr[] = new Triangulo[numero];

        for (int i = 0; i < numero; i++) {
            System.out.println("Ingrese la informacion del "+(i+1)+" triangulo");

            System.out.println("Ingrese el numero del lado: ");
            lado = sc.nextDouble();

            System.out.println("Ingrese el numero de la base: ");
            base = sc.nextDouble();

            tr[i] = new  Triangulo(base,lado);

            System.out.println("Area: "+tr[i].obtenerPerimetro());
            System.out.println("Perimetro: "+tr[i].obtenerArea());
        }
        System.out.println();

        System.out.println("El triangulo con el mayor superficie es: ");
        System.out.println(tr[mayorSuperficie(tr)].mostrarDatos());
    }
}
