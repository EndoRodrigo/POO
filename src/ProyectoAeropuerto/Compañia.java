package ProyectoAeropuerto;

public class Compañia {
    private String nombre;
    private Vuelo listsVuelo[] = new Vuelo[10];
    private  int numeroVuelo=0;

    public Compañia(String nombre) {
        this.nombre = nombre;
    }

    public Compañia(String nombre, Vuelo[] listsVuelo) {
        this.nombre = nombre;
        this.listsVuelo = listsVuelo;
        this.numeroVuelo = listsVuelo.length;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public void insertarVuelo(Vuelo v){
        listsVuelo[numeroVuelo] = v;
        numeroVuelo++;
    }

    public Vuelo getVuelo(int numero){
        return listsVuelo[numero];
    }

    public Vuelo getVuelo(String identificador){
        Vuelo vuelo = null;
        for (int i = 0; i < listsVuelo.length; i++) {
            if (identificador.equals(listsVuelo[i].getIdentificadorVuelo())) {
                vuelo = listsVuelo[i];
                break;
            }
        }

        return vuelo;
    }
}
