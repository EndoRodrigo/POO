package Ejercicio9;


import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
    static Scanner sc = new Scanner(System.in);
    static double lado1, lado2, lado3;

    public static void main(String[] args) {
        llenarPoligono();
        for (Poligono p : poligono){
            System.out.print("Los datos del los poligonos son: ");
            System.out.print(p.toString());
            System.out.print("El area del poligono es: ");
            System.out.print(p.Area());
            System.out.println("");
        }
    }

    public static void llenarPoligono(){
        int opcion;
        char respuesta;
        do {
            do {
                System.out.println("Diguite que poligono desea: ");
                System.out.println("1. Rectangulo");
                System.out.println("2. Triangulo");
                System.out.println("Ingrese la opcion: ");
                opcion = sc.nextInt();
            }while (opcion<0 || opcion > 2);

            switch (opcion){
                case 1:
                    // Rectabgulo
                    llenarRectangulo();
                    break;
                case 2:
                    //Triangulo
                    llenarTriangulo();
                    break;
            }

            System.out.println("Desea ingresra otro poligono(s/n): ");
            respuesta = sc.next().charAt(0);

        }while (respuesta == 's'|| respuesta == 'S');
    }

    public static void llenarTriangulo(){
        System.out.print("Ingrese el lado1 del triangulo: ");
        lado1 = sc.nextDouble();
        System.out.print("Ingrese el lado3 del triangulo: ");
        lado2 = sc.nextDouble();
        System.out.print("Ingrese el lado3 del triangulo: ");
        lado3 = sc.nextDouble();

        Triangulo tr = new Triangulo(lado1,lado2,lado3);

        //guaedaos una
        poligono.add(tr);
    }

    public static void llenarRectangulo(){
        System.out.print("Ingrese el lado1 del triangulo: ");
        lado1 = sc.nextDouble();
        System.out.print("Ingrese el lado3 del triangulo:");
        lado2 = sc.nextDouble();

        Rectangulo tr = new Rectangulo(lado1,lado2);

        poligono.add(tr);
    }
}
