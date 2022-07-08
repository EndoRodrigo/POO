package ProyectoAeropuerto;

public class AeropuertoPublico extends Aeropuerto{
    private double subvension;

    public AeropuertoPublico(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
    }

    public AeropuertoPublico(String nombre, String ciudad, String pais, double subvension) {
        super(nombre, ciudad, pais);
        this.subvension = subvension;
    }

    public double getSubvension() {
        return subvension;
    }
}
