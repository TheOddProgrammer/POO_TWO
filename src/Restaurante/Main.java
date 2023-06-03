package Restaurante;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    static ArrayList<Persona> persona = new ArrayList<Persona>();
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        llenarArray();
        mostrarDatos();
    }
    
    public static void llenarArray() {
        int opcion;
        String rta;
        
        do {
            do {
                System.out.print("Digite Status a Ingresar: "
                        + "\n1.Estudiante"
                        + "\n2.Docente"
                        + "\nOpcion: ");
                opcion = Integer.parseInt(sc.nextLine());
            } while (opcion<1 & opcion>2);
            System.out.println("");
            switch (opcion) {
                case 1:
                    llenarEstudiante();
                    break;
                case 2: 
                    llenarDocente();
                    break;
            }
            
            System.out.println("¿Desea Ingresar Otro Dato?");
            rta = sc.nextLine();
            System.out.println("");
            
        } while (rta.equalsIgnoreCase("y"));
        
    }
    
    public static void llenarDocente() {
        String nombre,id,tipo;
        
        System.out.print("Ingrese el Nombre: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese el Documento: ");
        id = sc.nextLine();
        System.out.print("Ingrese el Tipo de Docente \n1.Planta \n2.Catedratico \nOpcion:");
        tipo = sc.nextLine();
        
        Docente docente = new Docente(Integer.parseInt(tipo),nombre, id);
        
        persona.add(docente);
    } 
    
    public static void llenarEstudiante() {
        String nombre,id,cod;
        
        System.out.print("Ingrese el Nombre: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese el Documento: ");
        id = sc.nextLine();
        System.out.print("Ingrese Codigo Estudiante: ");
        cod = sc.nextLine();
        
        Estudiante estudiante = new Estudiante(cod, nombre, id);
        
        persona.add(estudiante);
    }
    
    public static void mostrarDatos() {
        for (Persona persona1 : persona) {
            System.out.println(persona1.toString());
            System.out.println("El Precio a Pagar es de: " + persona1.calcularPrecio());
            System.out.println("");
        }
    }
}
