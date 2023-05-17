/*Ejercicio
Hacer un programa para calcular el area de Poligonos (Triangulos, Rectangulos)
el Programa debe ser capaz de almacenas en un arreglo N triangulo y rectangulos,
y al final mostrar el area y los datos de cada uno. Para ello se tendra:
- Super Clase Poligono
- Clase Ractangulo
- Clase Triangulo
*/

package Practica_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>(); //Arreglo de Tipo Dinamico
    static Scanner sc = new Scanner(System.in);
    static Scanner scs = new Scanner(System.in);
    
    public static void main(String[] args) {
        llenarPoligono();
        mostrarPoligono();
    }
    
    public static void llenarPoligono() {
        int opcion;
        String rta;
        
        do {
            
            do {
                System.out.print("Digite Poligono Deseado: "
                        + "\n1.Triangulo "
                        + "\n2.Rectangulo "
                        + "\nOpcion: ");
                
                opcion = sc.nextInt();
            } while (opcion<1 & opcion>2);
            
            switch (opcion) {
                case 1: 
                    llenarTriangulo();
                    break;
                case 2:
                    llenarRectangulo();
                    break;
            }
            
            System.out.println("¿Se Ingresara otro Poligono? Y/N");
            rta = scs.nextLine().toLowerCase();
            System.out.println("");
            
        } while (rta.equals("y"));
        
    }
    
    public static void llenarTriangulo() {
        double lado1,lado2,lado3;
        
        System.out.print("\nDigite el Lado N°1: ");
        lado1 = sc.nextDouble();
        System.out.print("Digite el Lado N°2: ");
        lado2 = sc.nextDouble();
        System.out.print("Digite el Lado N°3: ");
        lado3 = sc.nextDouble();
        
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        
        //Triangulo dentro del Arreglo
        poligono.add(triangulo);
    }
    
    public static void llenarRectangulo() {
        double lado1,lado2;
        
        System.out.print("\nIngrese Lado N°1: ");
        lado1 = sc.nextDouble();
        System.out.print("Ingrese Lado N°2: ");
        lado2 = sc.nextDouble();
        
        Rectangulo rectangulo = new Rectangulo(lado1, lado2);
        
        //Rectangulo para Array
        poligono.add(rectangulo);
    }
    
    public static void mostrarPoligono() {
        for (Poligono poli : poligono) {
            System.out.println(poli.toString());
            System.out.println("El Area es = " + poli.calcularArea());
            System.out.println("");
        }
    }
}
