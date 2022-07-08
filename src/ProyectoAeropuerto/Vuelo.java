package ProyectoAeropuerto;

public class Vuelo {
    private String identificadorVuelo;
    private String ciudadOrigen;
    private String ciudadDestino;
    private double precio;
    private int numeroMaximoPasajeros;
    private int numeroActalPasajero;
    private Pasajero listaPasajero[];

    public Vuelo(String identificadorVuelo, String ciudadOrigen, String ciudadDestino, double precio, int numeroMaximoPasajeros) {
        this.identificadorVuelo = identificadorVuelo;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.precio = precio;
        this.numeroMaximoPasajeros = numeroMaximoPasajeros;
        this.numeroActalPasajero = 0;
        this.listaPasajero = new Pasajero[numeroMaximoPasajeros];
    }

    public String getIdentificadorVuelo() {
        return identificadorVuelo;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public double getPrecio() {
        return precio;
    }

    public int getNumeroMaximoPasajeros() {
        return numeroMaximoPasajeros;
    }

    public int getNumeroActalPasajero() {
        return numeroActalPasajero;
    }

    public Pasajero getPasajero(int i){
        return listaPasajero[i];
    }

    public Pasajero getPasajero(String pasaporte){
        Pasajero pasajero = null;
        for (int i = 0; i < listaPasajero.length; i++) {
            if (pasaporte.equals(listaPasajero[i].getPasaporte())) {
                pasajero = listaPasajero[i];
            }
        }

        return pasajero;
    }


    public void insertarPasajero(Pasajero p){
        listaPasajero[numeroActalPasajero] = p;
        numeroActalPasajero++;
    }
}
