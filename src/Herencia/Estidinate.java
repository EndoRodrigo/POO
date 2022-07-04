package Herencia;

public class Estidinate extends Persona{

    private int codigoEstidiante;
    private float notaFianl;

    public Estidinate(String nombres, String apellidos, int edad, int codigoEstidiante, float notaFianl) {
        super(nombres, apellidos, edad);
        this.codigoEstidiante = codigoEstidiante;
        this.notaFianl = notaFianl;
    }


    public String mostrarDatos(){
        return "\nNombreS: "+getNombres()+"\nApellidos: "+getApellidos()+"\nEdad: "+getEdad()
                +"\nCodigo Estudiante: "+codigoEstidiante+"\nNota final: "+notaFianl;
    }
}
