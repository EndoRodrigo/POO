package Ejercicio9;

public abstract class Poligono {
    protected int numeroLado;

    public Poligono(int numeroLado) {
        this.numeroLado = numeroLado;
    }

    public int getNumeroLado() {
        return numeroLado;
    }

    @Override
    public String toString() {
        return "Poligono{" +
                "numeroLado=" + numeroLado +
                '}';
    }

    public abstract double Area();
}