package Colecciones;

import java.util.HashSet;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        
//        ArrayList<Integer> numero = new ArrayList<>();
//        
//        numero.add(5);
//        numero.add(4);
//        numero.add(3);
//        numero.add(2);
//        numero.add(1);
//        
//        
//        numero.forEach(System.out::println);
//        
//        numero.forEach((integer) -> {
//            System.out.println(integer);
//        });

//          HashSet<Integer> numero = new HashSet<>();
//          
//          numero.add(4);
//          numero.add(2);
//          numero.add(3);
//          numero.add(500);
//          numero.add(1323);
//          numero.add(1222);
//          numero.add(0);
//          numero.add(7);
//          numero.add(303);
//          numero.add(23);
//          numero.add(15);
//          
//          numero.forEach((integer) -> {
//              System.out.println(integer);
//        });


          Vector<Integer> numeros = new Vector<>();
          
          numeros.add(3);
          numeros.add(50);
          numeros.add(0,70);
          numeros.add(0,70);
          numeros.add(80);
          numeros.add(3,30);
          numeros.add(30);
          
          numeros.forEach((numero) -> {
              System.out.println(numero);
        });
    }
}
