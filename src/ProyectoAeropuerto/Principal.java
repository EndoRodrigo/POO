package ProyectoAeropuerto;

import java.util.Scanner;

public class Principal {
    static Scanner sc = new Scanner(System.in);
    final static int numero = 3; // numero de aeropuertos
    static Aeropuerto aeropuertos[] = new Aeropuerto[numero];


    public static void main(String[] args) {
        // insertar datos del aeropuerto
        insertarDatosAeropuerto(aeropuertos);
        menu();

    }

    public static void insertarDatosAeropuerto(Aeropuerto aero[]){

        aero[0] = new AeropuertoPublico("JORGE CHAVEZ","LIMA","PERU",80000000);
        aero[0].insertarCompañia(new Compañia("AEROPERU"));
        aero[0].insertarCompañia(new Compañia("LATAM"));
        aero[0].getCompañia("AEROPERU").insertarVuelo(new Vuelo("IB20","LIMA","MEXICO",150.90,150));
        aero[0].getCompañia("AEROPERU").insertarVuelo(new Vuelo("IB21","LIMA","BUENOS AIRES",180.99,120));
        aero[0].getCompañia("LATAM").insertarVuelo(new Vuelo("FC12","LIMA","LONDRES",500.90,180));
        aero[0].getCompañia("AEROPERU").getVuelo("IB20").insertarPasajero(new Pasajero("ALEJANDRO","37NS9345","PERUANO"));
        aero[0].getCompañia("AEROPERU").getVuelo("IB20").insertarPasajero(new Pasajero("MARIA","MK9847934","MEXICANA"));
        aero[0].getCompañia("LATAM").getVuelo("FC12").insertarPasajero(new Pasajero("POBERTO","347539SJD","PERUANO"));

        aero[1] = new AeropuertoPublico("EL DORADO","BOGOTA","COLOMBIA",10000000);
        aero[1].insertarCompañia(new Compañia("AVIANCA"));
        aero[1].insertarCompañia(new Compañia("FOX"));
        aero[1].getCompañia("FOX").insertarVuelo(new Vuelo("MN01","BOGOTA","MEXICO",80.90,50));
        aero[1].getCompañia("FOX").insertarVuelo(new Vuelo("MN02","BOGOTA","BUENOS AIRES",100.99,20));
        aero[1].getCompañia("AVIANCA").insertarVuelo(new Vuelo("KL15","LIMA","LONDRES",450.90,80));
        aero[1].getCompañia("FOX").getVuelo("MN01").insertarPasajero(new Pasajero("JUAN","00111ML","COLOMBIANO"));
        aero[1].getCompañia("FOX").getVuelo("MN01").insertarPasajero(new Pasajero("ALEJANDRA","00222MN","MEXICANA"));
        aero[1].getCompañia("AVIANCA").getVuelo("KL15").insertarPasajero(new Pasajero("PATRICIA","22228HYD","CHILENO"));

        aero[2] = new AeropuertoPrivado("RIO NREGRO","NEW YORK","ESTADOS UNIDOS");
        aero[2].insertarCompañia(new Compañia("TELCOR"));
        aero[2].insertarCompañia(new Compañia("COORP"));
        String empresa[] = {"LATEIOS","CARNICOS"};
        ((AeropuertoPrivado)aero[2]).insertarEmpresa(empresa);
        aero[2].getCompañia("TELCOR").insertarVuelo(new Vuelo("QQ99","NEW YORK","CANADA",1180.90,150));
        aero[2].getCompañia("TELCOR").insertarVuelo(new Vuelo("QQ02","NEW YORK","PUERTO RICO",180.99,120));
        aero[2].getCompañia("COORP").insertarVuelo(new Vuelo("XX21","NEW YORK","CHILE",4590.90,280));
        aero[2].getCompañia("TELCOR").getVuelo("QQ99").insertarPasajero(new Pasajero("JUANITA","090999999999NN","VENEZUELA"));
        aero[2].getCompañia("TELCOR").getVuelo("QQ99").insertarPasajero(new Pasajero("DIANITA","32323N3M222","PANAMA"));
        aero[2].getCompañia("COORP").getVuelo("XX21").insertarPasajero(new Pasajero("JIMENITA","121212122V2G","CHILENO"));

    }

    public static void menu(){
        String nombreAeropuerto, nombreCompania, origen, destino;
        Aeropuerto puerto;
        Compañia com;
        int opcion = 0;
        do {
            System.out.println("\t.:M E N U:.");
            System.out.println("1. Consultar Aerpuertos (Publicos/Privado)");
            System.out.println("2. Ver empresa(Privada) o Subvecion(Publico)");
            System.out.println("3. Lista de compania de un Aeropuerto");
            System.out.println("4. Lista de vuelos por compania");
            System.out.println("5. Salir");
            System.out.print("Ingrese la opcion: ");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("");
                    mostrarDatosAeropuerto(aeropuertos);
                    break;
                case 2:
                    mostrarPatrocinio(aeropuertos);
                    break;
                case 3:
                    sc.nextLine();
                    System.out.print("Diguite el nombre de aeropuerto: ");
                    nombreAeropuerto = sc.nextLine();

                    puerto = buscarAeropuero(nombreAeropuerto, aeropuertos);
                    if (puerto == null){
                        System.out.println("EL AEROPUERO INGRESADO NO EXISTE");
                    }else {
                        mostrarCompañias(puerto);
                    }
                    break;
                case 4:
                    sc.nextLine();
                    System.out.println("Ingrese el nombre del aeropuerto: ");
                    nombreAeropuerto = sc.nextLine();
                    puerto = buscarAeropuero(nombreAeropuerto,aeropuertos);
                    if (puerto == null) {
                        System.out.println("El aeropuerto no existe");
                    }else {
                        System.out.print("Diguite el nombre de la compañia:");
                        nombreCompania = sc.nextLine();
                        com = puerto.getCompañia(nombreCompania);
                        mostrarCompañia(com);
                    }
                    break;

                case 5:
                    break;
                default:
                    System.out.println("Error! se equivoco de opcion de menu");
            }
            System.out.println("");
        }while (opcion !=6);
    }

    private static void mostrarCompañias(Aeropuerto puerto) {
        System.out.println("Lista de compnias");
        for (int i = 0; i < puerto.getNumeroCompañia(); i++) {
            System.out.println(puerto.getCompañia(i).getNombre());
        }

    }

    private static Aeropuerto buscarAeropuero(String nombreAeropuerto, Aeropuerto[] ae) {
        System.out.println("");
        Aeropuerto aero = null;
        for (int i = 0; i < ae.length; i++) {
            if (nombreAeropuerto.equals(ae[i].getNombre())) {
                aero = ae[i];
                break;
            }
        }

        return aero;
    }

    private static void mostrarPatrocinio(Aeropuerto[] aero) {
        String empresas[];
        for (int i = 0; i < aero.length; i++) {
            if (aero[i] instanceof AeropuertoPrivado) {
                System.out.println("");
                System.out.println("AEROPUERTO PRIVADO");
                System.out.println("Nombres: "+aero[i].getNombre());

                empresas = ((AeropuertoPrivado)aero[i]).getListaEmpresa();

                System.out.println("EMPRESAS: ");

                for (int j = 0; j < empresas.length; j++) {
                    System.out.println(empresas[j]);
                }
            }else {
                System.out.println();
                System.out.println("AEROPUERTO PUBLICO");
                System.out.println("Nombres: "+aero[i].getNombre());
                System.out.println("Subbension: "+((AeropuertoPublico)aero[i]).getSubvension());
            }
        }
    }

    public static void mostrarDatosAeropuerto(Aeropuerto aero[]){
        for (int i = 0; i < aero.length; i++) {
            if (aero[i] instanceof AeropuertoPrivado){

                System.out.println("AEROPUERTO PRIVADO");
                System.out.println("Nombres: "+aero[i].getNombre());
                System.out.println("Ciudad: "+aero[i].getCiudad());
                System.out.println("Pais: "+aero[i].getPais());

            }else {

                System.out.println("AEROPUERTO PUBLICO");
                System.out.println("Nombres: "+aero[i].getNombre());
                System.out.println("Ciudad: "+aero[i].getCiudad());
                System.out.println("Pais: "+aero[i].getPais());

            }
            System.out.println("");
        }
    }

    public static void mostrarCompañia(Compañia c){
        System.out.println("");
        Vuelo v = null;
        System.out.println("Los vuelos de la compañia: "+c.getNombre());
        for (int i = 0; i < c.getNumeroVuelo(); i++) {
                v = c.getVuelo(i);
            System.out.println("Identificador: "+v.getIdentificadorVuelo());
            System.out.println("Ciudad Origen: "+v.getCiudadOrigen());
            System.out.println("Ciudad Destino: "+v.getCiudadDestino());
            System.out.println("Precio Vuelo: "+v.getPrecio());
            System.out.println("");
        }
    }


}
