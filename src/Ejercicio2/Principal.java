package Ejercicio2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tablero t1;
        int x , y, opcion, incremento = 0;

        System.out.println("Ingrese la coordenadas en x");
        x = sc.nextInt();

        System.out.println("Ingrese la coordenadas en y");
        y = sc.nextInt();

        t1 = new Tablero(x,y);

        do {
            System.out.println("== Menu  ==");
            System.out.println("1. Mover hacia Arriba");
            System.out.println("2. Mover hacia Abajo");
            System.out.println("3. Mover hacia Izquierda");
            System.out.println("4. Mover hacia la derecha");
            System.out.println("5. Salir");

            System.out.print("Ingrese la opcion: ");
            opcion = sc.nextInt();

            if (opcion != 5){
                System.out.print("Ingrese la cantidad de espacios a mover: ");
                incremento = sc.nextInt();
            }

            switch (opcion){
                case 1:
                    t1.moverArriba(incremento);
                    break;
                case 2:
                    t1.moverAbajo(incremento);
                    break;
                case 3:
                    t1.moverIzquierda(incremento);
                    break;
                case 4:
                    t1.moverDerecha(incremento);
                    break;
                case 5:

                    break;
                default:
                    System.out.println("Se equivoco de opcion de menu");
                    break;
            }
            System.out.println("La posicion actual de {x,y} es: ("+t1.getX()+" , "+t1.getY()+")\n");
        }while (opcion != 5);



    }
}
