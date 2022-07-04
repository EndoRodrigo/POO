package Ejercicio8;

import java.awt.event.PaintEvent;
import java.util.Scanner;

public class Principal {

    public static int encontarSucursal(Sucursal T[],int numeroSucursal, int contadorSucursal){
        int index = 0;
        boolean encontre = false;
        for (int i = 0; i < contadorSucursal; i++) {
            if (T[i].getNumeroSucursal() == numeroSucursal){
                encontre = true;
                index = i;
            }
        }
        if (encontre == false){
            index = -1;
        }

        return index;
    }

    public static int encontarPaquete(Paquete p[],int numeroPaquete, int contadorPaquete){
        int index = 0;
        boolean encontre = false;
        for (int i = 0; i < contadorPaquete; i++) {
            if (p[i].getNumeroPaquete() == numeroPaquete){
                encontre = true;
                index = i;
            }
        }
        if (encontre == false){
            index = -1;
        }

        return index;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numeroSucursal,numeroPaquete,prioridad = 0,opcion=0, conatorSucursal=0,indexSucarsal,contadorPaquete=0,
                indicePaquete = 0;
        String direccion, ciudad,DNI;
        double peso, precioPaquete= 0;
        Sucursal sucursales[] = new Sucursal[50];
        Paquete paquetes[] = new Paquete[100];

        do {
            System.out.println("\t .:Menu:.");
            System.out.println("1. Creae una nueva sucursal");
            System.out.println("2. Enviar paquete");
            System.out.println("3. Consultar sucursal");
            System.out.println("4. Consultar paquete");
            System.out.println("5. Mostrar datos de las sucursales");
            System.out.println("6. Mostrar datos de los paquetes");
            System.out.println("7. Salir");

            System.out.println("Selecione una opcion de menu: ");
            opcion = entrada.nextInt();

            System.out.println("");
            switch (opcion){
                case 1:
                    System.out.print("Ingrese el numero de la sucursal: ");
                    numeroSucursal = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("Ingrese la direccion de la sucursal: ");
                    direccion = entrada.nextLine();
                    System.out.print("Ingrese la ciudad de la sucursal: ");
                    ciudad = entrada.nextLine();

                    sucursales[conatorSucursal]= new Sucursal(numeroSucursal,direccion,ciudad);
                    conatorSucursal++;

                    System.out.println("");
                    break;
                case 2:
                    System.out.print("Ingrese el numero de la sucursal: ");
                    numeroSucursal = entrada.nextInt();

                    indexSucarsal = encontarSucursal(sucursales,numeroSucursal,conatorSucursal);
                    if (indexSucarsal == -1) {
                        System.out.println("La sucuesal ingresada no existe ");
                    }else {
                        System.out.print("Ingrese el numero del paquete: ");
                        numeroPaquete = entrada.nextInt();
                        System.out.print("Ingrese el DNI de la persona: ");
                        DNI = entrada.nextLine();
                        System.out.print("Ingrese el peso del paquete: ");
                        peso = entrada.nextDouble();
                        System.out.print("Ingrese la prioridad del [0=Normal 1=Alta 2.Express]: ");
                        numeroPaquete = entrada.nextInt();

                        paquetes[contadorPaquete] = new Paquete(numeroPaquete,DNI, peso, prioridad);


                        precioPaquete = sucursales[indexSucarsal].calcularPrecio(paquetes[contadorPaquete]);

                        System.out.println("El precio del paquete es: "+precioPaquete);
                        contadorPaquete++;
                    }
                    System.out.println("");
                    break;
                case 3:
                    System.out.print("Ingrese el numero de la sucursal: ");
                    numeroSucursal = entrada.nextInt();

                    indexSucarsal = encontarSucursal(sucursales,numeroSucursal,conatorSucursal);
                    if (indexSucarsal == -1) {
                        System.out.println("La sucursal no existe");
                    }else{
                        System.out.println("Los datos de la sucursal son: "+sucursales[indexSucarsal].mostrarCiudad());
                    }
                    System.out.println("");
                    break;
                case 4:
                    System.out.print("Ingrese el numero del paquete: ");
                    numeroPaquete = entrada.nextInt();

                    indicePaquete = encontarPaquete(paquetes,numeroPaquete,contadorPaquete);
                    if (indicePaquete == -1) {
                        System.out.println("El paquete no existe");
                    }else {
                        System.out.println("Los datos del paquete son: ");
                        System.out.println(paquetes[indicePaquete].mostrarPaquete());
                    }
                    System.out.println("");
                    break;
                case 5:
                    for (Sucursal c: sucursales) {
                        System.out.println("Los datos de las sucursales");
                        System.out.println(c);
                    }
                    System.out.println("");
                    break;
                case 6:
                    for (Paquete p: paquetes) {
                        System.out.println("Los datos de las paquetes");
                        System.out.println(p);
                    }
                    System.out.println("");
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opcion de menu incorrecto");
            }
        }while (opcion != 7);

    }
}
