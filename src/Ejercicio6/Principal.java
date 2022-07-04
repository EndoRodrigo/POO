package Ejercicio6;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        NumeroComplejo numero1, numero2, suma, mult;
        double a, b, c , d;
        int opcion,numero;

        do {
            System.out.println("\t .:Opereciones con numeros complejos:.");
            System.out.println("1. Sumar dos numeros complejos: ");
            System.out.println("2. Multiplicar dos numeros complejos: ");
            System.out.println("3. Comparar dos numeros compeljos (igual o no): ");
            System.out.println("4, Multiplicar un numero complejo por un entero: ");
            System.out.println("5. Salir");
            System.out.println("Ingrese su opcion de menu: ");
            opcion = entrada.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Digite el primer numero complejo");
                    System.out.print("Digite la parte real: ");
                    a = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    b = entrada.nextDouble();
                    System.out.println("Digite el segundo numero complejo");
                    System.out.print("Digite la parte real: ");
                    c = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    d = entrada.nextDouble();

                    numero1 = new NumeroComplejo(a, b);
                    numero2 = new NumeroComplejo(c, d);

                    suma = numero1.calcularSuma(numero2);
                    System.out.println("La suma es "+suma.getA()+ " + "+suma.getB()+"i");
                    break;
                case 2:
                    System.out.println(" Digite el primer numero complejo");
                    System.out.print("Digite la parte real: ");
                    a = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    b = entrada.nextDouble();
                    System.out.println("Digite el segundo numero complejo");
                    System.out.print("Digite la parte real: ");
                    c = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    d = entrada.nextDouble();

                    numero1 = new NumeroComplejo(a, b);
                    numero2 = new NumeroComplejo(c, d);

                    mult = numero1.calcularProducto(numero2);
                    System.out.println("La suma es "+mult.getA()+ " * "+mult.getB()+"i");
                    break;
                case 3:
                    System.out.println(" Digite el primer numero complejo");
                    System.out.print("Digite la parte real: ");
                    a = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    b = entrada.nextDouble();
                    System.out.println("Digite el segundo numero complejo");
                    System.out.print("Digite la parte real: ");
                    c = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    d = entrada.nextDouble();

                    numero1 = new NumeroComplejo(a, b);
                    numero2 = new NumeroComplejo(c, d);

                    if (numero1.calcularIgualdad(numero2)) {
                        System.out.println("Los numeros complejos son iguales");
                    }else {
                        System.out.println("Los numeros enteros no son iguales");
                    }
                    break;
                case 4:
                    System.out.println(" Digite el primer numero complejo");
                    System.out.print("Digite la parte real: ");
                    a = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    b = entrada.nextDouble();
                    System.out.print("Digite un numero entero: ");
                    numero = entrada.nextInt();

                    numero1 = new NumeroComplejo(a, b);

                    mult = numero1.multiplicarPorEntero(numero);
                    System.out.println("La multiplicacion resultante es: "+mult.getA()+ " * "+mult.getB()+"i");
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcion no esta defiida");
            }
            System.out.println();
        }while (opcion != 5);
    }
}
