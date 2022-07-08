package ProyectoAeropuerto;

public class Aeropuerto {
    private String nombre;
    private String ciudad;
    private String pais;
    private Compañia listaCompañia[] = new Compañia[10];
    private int numeroCompañia;

    public Aeropuerto(String nombre, String ciudad, String pais) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.numeroCompañia = 0;
    }

    public Aeropuerto(String nombre, String ciudad, String pais, Compañia[] c) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        listaCompañia = c;
        this.numeroCompañia = c.length;
    }

    public void insertarCompañia(Compañia compañia){
        listaCompañia[numeroCompañia] = compañia;
        numeroCompañia++;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }

    public Compañia[] getListaCompañia() {
        return listaCompañia;
    }

    public int getNumeroCompañia() {
        return numeroCompañia;
    }

    public Compañia getCompañia(int i){
        return listaCompañia[i];
    }

    public Compañia getCompañia(String nombre){
        Compañia compañia = null;
        for (int i = 0; i < listaCompañia.length; i++) {
            if (nombre.equals(listaCompañia[i].getNombre())) {
                compañia = listaCompañia[i];
                break;
            }
        }

        return compañia;
    }
}
