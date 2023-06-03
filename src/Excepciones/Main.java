package Excepciones;

//Importaciones
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        //Excepciones Verificadas
            //Lectura de Archivo *txt
            BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\Garzón\\OneDrive\\Escritorio\\Chupapijas.txt"));
            String linea;
            
            if ((linea = bf.readLine())!=null) {
                System.out.println(linea);
                System.out.println("");
            } else {
                System.out.println("Mano, el Archivo Esta Vacio");
            }
            
        //
        
    }
}
