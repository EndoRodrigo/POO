package Ejercicio7;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double cantidad = 0;
        int opcion, index = 0;
        String cliente = null;
        Cliente cl = null;
        Cuenta cuenta[] = new Cuenta[2];

        cuenta[0] = new Cuenta(00001, 9000);
        cuenta[1] = new Cuenta(00001, 10000);


        Cliente c1 = new Cliente("Endo", "Rodrigo", "1116666", cuenta);
        Cliente c2 = new Cliente("Rodrigo", "Ariza", "1110000", cuenta);

        for (int i = 0; i < 1; i++) {
            System.out.println("Bienvenidio al banco");
            System.out.println("Ingrese su numero de identificacion: ");
            cliente = entrada.nextLine();

            if(cliente.equals(c1.getDni())){
                cl = c1;
                index= 0;
            }else {
                cl = c2;
                index = 1;
            }
        }

        if (cliente.equals(c1.getDni()) || cliente.equals(c2.getDni())) {
            do {
                System.out.println("== B A N C O ==");
                System.out.println("1. Consultar saldo");
                System.out.println("2. Ingresar dinero");
                System.out.println("3. Retirar dinero");
                System.out.println("4. Salir");
                System.out.print("Selecione una opcion: ");
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Su saldo es: " + cl.cuenta[index].getSaldo());
                        break;
                    case 2:
                        System.out.print("Ingrese el monto a ingresar: ");
                        cantidad = entrada.nextDouble();
                        cl.cuenta[index].ingresarDinero(cantidad);
                        break;
                    case 3:
                        System.out.print("Ingrese el monto a retirar: ");
                        cantidad = entrada.nextDouble();
                        cl.cuenta[index].retirarDinero(cantidad);
                        break;
                    case 4:
                        break;
                }
                System.out.println("");
            } while (opcion != 4);
        } else {
            System.out.println("El numero de identificacion no esta regstrado en nuestro banco");
        }
    }
}
