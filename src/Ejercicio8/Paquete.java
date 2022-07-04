package Ejercicio8;

public class Paquete {
    private int numeroPaquete;
    private String DNI;
    private double peso;
    private int prioridad;

    public Paquete(int numeroPaquete, String DNI, double peso, int prioridad) {
        this.numeroPaquete = numeroPaquete;
        this.DNI = DNI;
        this.peso = peso;
        this.prioridad = prioridad;
    }

    public int getNumeroPaquete() {
        return numeroPaquete;
    }

    public String getDNI() {
        return DNI;
    }

    public double getPeso() {
        return peso;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public String mostrarPaquete(){
        return "\nNumero paquete: "+numeroPaquete+"\n DNI:  "+DNI+"\n Peso: "+peso+"\n Prioridad: "+prioridad;
    }
}
