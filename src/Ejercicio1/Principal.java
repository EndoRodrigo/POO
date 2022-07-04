package Ejercicio1;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        Cuadrilatero  c1;
        float lado1, lado2;

        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el lado1: "));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el lado2: "));

        if (lado1 == lado2) {
            c1 = new Cuadrilatero(lado1);
        }else {
            c1 = new Cuadrilatero(lado1, lado2);
        }

        System.out.println("El perimetro es: "+c1.getPerimmetro());
        System.out.println("El ares es: "+c1.getArea());
    }
}
