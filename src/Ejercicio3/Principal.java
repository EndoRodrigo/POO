package Ejercicio3;

import java.util.Scanner;

public class Principal {

    public static int indexMasBarato(Vehiculo autos[]){
        float precio, precio1;
        int indice = 0;
        for (int i = 1; i < autos.length; i++) {
            precio = autos[0].getPrecio();
            precio1 = autos[i].getPrecio();
            if (precio1 < precio){
                precio = autos[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String marca, modelo;
        float precio;
        int numeroVehiculos, indiceBarato;


        System.out.print("Ingres el numero de vehiculos: ");
        numeroVehiculos = sc.nextInt();

        // Creamos los objetos para el coche
        Vehiculo coches[] = new Vehiculo[numeroVehiculos];

        for (int i = 0; i < numeroVehiculos; i++) {
            sc.nextLine();
            System.out.println("Digite las caracteristicas del vehiculo "+(i+1)+"\n");
            System.out.println("Ingrese la marcar del coche");
            marca = sc.nextLine();
            System.out.println("Ingrese el modelo del coche");
            modelo = sc.nextLine();
            System.out.println("Ingrese el precio del coche");
            precio = sc.nextFloat();

            coches[i] = new Vehiculo(marca,modelo,precio);
        }

        indiceBarato = indexMasBarato(coches);

        System.out.println("EL COCHE MAS BARATO ES: ");
        System.out.println(coches[indiceBarato].mostrarDatos());
    }

}
