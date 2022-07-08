package ProyectoAeropuerto;

public class Pasajero {
    private String nombre;
    private String Pasaporte;
    private String nacionalidad;

    public Pasajero(String nombre, String pasaporte, String nacionalidad) {
        this.nombre = nombre;
        Pasaporte = pasaporte;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPasaporte() {
        return Pasaporte;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
}
