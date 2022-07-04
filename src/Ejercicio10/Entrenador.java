package Ejercicio10;

public class Entrenador extends Persona{
    private String estrategia;

    public Entrenador(String nombres, String apellidos, int edad, String estrategia) {
        super(nombres, apellidos, edad);
        this.estrategia = estrategia;
    }

    public String getEstrategia() {
        return estrategia;
    }


    @Override
    public void partifoFutbol() {
        System.out.println("Dirigue un partido");
    }

    @Override
    public void entrenamiento() {
        System.out.println("Dirigue un entrenamiento");
    }

    public void planificarEntrenamiento(){
        System.out.println("Planificar entrenamiento");
    }
}
