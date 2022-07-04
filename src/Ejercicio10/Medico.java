package Ejercicio10;

public class Medico extends Persona{

    private String titulacion;
    private int añosExperiencia;

    public Medico(String nombres, String apellidos, int edad, String titulacion, int añosExperiencia) {
        super(nombres, apellidos, edad);
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    @Override
    public void partifoFutbol() {
        System.out.println("Asistencia medica partido");
    }

    @Override
    public void entrenamiento() {
        System.out.println("Asistencia medica entrenamiento");
    }

    public void curarLesion(){
        System.out.println("Curar lesion");
    }
}
