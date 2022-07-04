package Ejercicio4;

import java.util.Scanner;

public class Principal {

    public static int indexGanador(Atetla atetla[]){
        int index = 0;
        float tiempo;
        tiempo = atetla[0].getTiempoCarrera();
        for (int i = 1; i < atetla.length; i++) {
            if (atetla[i].getTiempoCarrera() < tiempo){
                tiempo = atetla[i].getTiempoCarrera();
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        // Costruir un programa para una competencia de atletismo
        // el programa debe gestionar una serie de atetlas
        // caracterisados por su numero de atetla, nombre y tiempo de carrera
        // al final del programa debe mostrar los datos del atetla ganador

        Scanner sc = new Scanner(System.in);
        int numero, numeroAtetla, ganador;
        float tiempo;
        String nombres;


        System.out.println("Ingrese el numeros de los atetlas: ");
        numero = sc.nextInt();
        Atetla atetla[] = new Atetla[numero];

        for (int i = 0; i < numero; i++) {
            System.out.println("Ingrese los datos del atetla "+(i+1));

            System.out.print("Ingrese el # del atetla: ");
            numeroAtetla = sc.nextInt();
            sc.nextLine();
            System.out.print("Ingrese el nombre del atetla: ");
            nombres = sc.nextLine();

            System.out.print("Ingrese el tiempo de la carrera: ");
            tiempo = sc.nextFloat();

            atetla[i] = new Atetla(numeroAtetla,nombres,tiempo);
        }

        System.out.println();
        System.out.println("== ATLETA GANADOR ES: ");
        ganador = indexGanador(atetla);
        System.out.println(atetla[ganador].mostrarDatosGanador());


    }
}
