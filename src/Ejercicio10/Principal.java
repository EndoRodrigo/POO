package Ejercicio10;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    // Crear un programa para simular un equipo de futbol (Futbolista, entrenador y medico)
    // para lo cual tenemos lo siguientes:

    // 1. un super clase Persona que tendra los siguientes datos nombres, aoellidos, edad
    // 2. un subclase futbolista tendra los siguientes datos dorsal y posicion
    // 3. un subclase entrenador que tendra el dato estratehia utilizada
    // 4. un subclase doctro tendra los datos titulos años de experiencia

    // Hacer un menu donde tenga las siguientes opciones:
    // 1. Viajes de equipo
    // 2. Entrenamiento
    // 3. Partido de futbol
    // 4. Planificar entrenamiento
    // 5. Entrevista
    // 6. Curar lesion

    static ArrayList<Persona> persona = new ArrayList<Persona>();
    static Scanner sc = new Scanner(System.in);
    static int opcion;

    static Persona futbolista1 = new Futbolista("HIGUARON","DGONZALO",29,9,"DELANTERO");
    static Persona futbolista2 = new Futbolista("PAULO","NIVARA",23,21,"DELANTERO");
    static Persona entrenador = new Entrenador("MAXIMILIANO","ALERI",49,"Defensiva");
    static Persona medico = new Medico("Alex","mariz",55,"Licenciado fisioterapia",20);

    public static void main(String[] args) {
        persona.add(futbolista1);
        persona.add(futbolista2);
        persona.add(entrenador);
        persona.add(medico);

        menu();
    }

    public static void menu(){
        do {
            System.out.println("\t.:M E N U:.");
            System.out.println("1. Viajes de equipo");
            System.out.println("2. Entrenamiento");
            System.out.println("3. Partido de futbol");
            System.out.println("4. Planificar entrenamiento");
            System.out.println("5. Entrevista");
            System.out.println("6. Curar lesion");
            System.out.println("7. Salir");

            System.out.print("Ingrese la opcion: ");
            opcion = sc.nextInt();

            switch (opcion){
                case 1: // Viage equipo
                    System.out.println("EQUIPO DE VIAJE");
                    viajarEquipo();
                    break;
                case 2: // entrenamiento
                    System.out.println("EQUIPOS EN ENTRENAMIENTO");
                    entrenarEquipo();
                    break;
                case 3: // Partifo futbol
                    System.out.println("PARTIDO DE FUTBOL");
                    partifoEquipo();
                    break;
                case 4: // Planificar entrenamiento
                    System.out.println("PLANIFICAR ENTRENAMIENTO");
                    planificarEntrenamiento();
                    break;
                case 5: // Entrevista
                    System.out.println("ENTREVISTA");
                    entrevista();
                    break;
                case 6: // Curar lesion
                    System.out.println("CURAR ENTREVISTA");
                    curarLesion();
                    break;
                case 7: // Salir
                    break;
                default:
                    System.out.println("Elejio la opcion incorrecta");
            }
            System.out.println("");

        }while (opcion != 7);
    }
    public static void viajarEquipo(){
        System.out.println("");
        for (Persona p:persona) {
            System.out.print(p.apellidos +" "+p.nombres+" -> ");
            p.viajar();
        }
    }

    public static void entrenarEquipo(){
        System.out.println("");
        for (Persona p:persona) {

            System.out.print(p.apellidos +" "+p.nombres+" -> ");
            p.entrenamiento();
        }
    }

    public static void partifoEquipo(){
        System.out.println("");
        for (Persona p:persona) {

            System.out.print(p.apellidos +" "+p.nombres+" -> ");
            p.partifoFutbol();
        }
    }

    public static void planificarEntrenamiento(){
        System.out.println("");
        System.out.print(entrenador.apellidos +" "+entrenador.nombres+" -> ");
        ((Entrenador)entrenador).planificarEntrenamiento();
    }

    public static void entrevista(){
        System.out.println("");
        System.out.print(futbolista1.apellidos +" "+futbolista1.nombres+" -> ");
        ((Futbolista)futbolista1).entrevista();

        System.out.print(futbolista2.apellidos +" "+futbolista2.nombres+" -> ");
        ((Futbolista)futbolista2).entrevista();
    }

    public static void curarLesion(){
        System.out.println("");
        System.out.print(medico.apellidos +" "+medico.nombres+" -> ");
        ((Medico)medico).curarLesion();
    }

}
