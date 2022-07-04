package Ejercicio4;

public class Atetla {
    private int numeroAtetla;
    private String nombres;
    private float tiempoCarrera;

    public Atetla(int numeroAtetla, String nombres, float tiempoCarrera) {
        this.numeroAtetla = numeroAtetla;
        this.nombres = nombres;
        this.tiempoCarrera = tiempoCarrera;
    }

    public float getTiempoCarrera() {
        return tiempoCarrera;
    }

    public String mostrarDatosGanador(){
        return "Id de corredor: "+numeroAtetla+"\nNombres: "+nombres+"\nTiempo de carrera: "+tiempoCarrera;
    }
}
