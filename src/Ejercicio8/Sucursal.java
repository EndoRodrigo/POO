package Ejercicio8;

public class Sucursal {
    private int numeroSucursal;
    private String dirrecion;
    private String ciudad;

    public Sucursal(int numeroSucursal, String dirrecion, String ciudad) {
        this.numeroSucursal = numeroSucursal;
        this.dirrecion = dirrecion;
        this.ciudad = ciudad;
    }

    public int getNumeroSucursal() {
        return numeroSucursal;
    }

    public String getDirrecion() {
        return dirrecion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String mostrarCiudad(){
        return "\nNumero Sucursal: "+numeroSucursal
                +"\nDirrecion: "+dirrecion
                +"\nCiudad: "+ciudad;
    }

    public double calcularPrecio(Paquete t){
        double precio;
        precio = t.getPeso();
        if (t.getPrioridad() == 1) {
            precio+=10;
        }
        if (t.getPrioridad() == 2) {
            precio+=20;
        }
        return precio;
    }
}
