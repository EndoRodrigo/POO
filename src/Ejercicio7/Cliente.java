package Ejercicio7;

public class Cliente {
    private String nombres;
    private  String apellidos;
    private String dni;

    Cuenta cuenta[];

    public Cliente(String nombres, String apellidos, String dni, Cuenta[] cuenta) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.cuenta = cuenta;
    }
    public Cliente(){

    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public double consultarSaldo(int n){
        return cuenta[n].getSaldo();
    }

    public void ingresar_Dinero(int n, double cantidad){
        cuenta[n].ingresarDinero(cantidad);
    }

    public void retirar_Dinero(int n, double cantidad){
        cuenta[n].retirarDinero(cantidad);
    }

}
