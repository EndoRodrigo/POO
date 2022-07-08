package ProyectoAeropuerto;

public class AeropuertoPrivado extends Aeropuerto{
    private String[] listaEmpresa = new String[10];
    private int numeroEmpresa;

    public AeropuertoPrivado(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
    }

    public AeropuertoPrivado(String nombre, String ciudad, String pais, Compañia[] c, String[] listaEmpresa) {
        super(nombre, ciudad, pais, c);
        this.listaEmpresa = listaEmpresa;
        this.numeroEmpresa = listaEmpresa.length;
    }

    public void insertarEmpresa(String empresa[]){
        this.listaEmpresa = empresa;
        this.numeroEmpresa++;
    }

    public void insertarEmpresa(String empresa){
        listaEmpresa[numeroEmpresa] = empresa;
        numeroEmpresa++;
    }

    public String[] getListaEmpresa() {
        return listaEmpresa;
    }
}
