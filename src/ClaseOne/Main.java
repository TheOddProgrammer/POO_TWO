package ClaseOne;

public class Main {
    public static void main(String[] args) {
        Docente docente = new Docente("Andres","192125","3205106364");
        
        boolean edad = docente.calcularEdad("20");
        
        if (edad) {
            System.out.println("Es Mayor de Edad");
        } else {
            System.out.println("No es Mayor de Edad");
        }
        
        Estudiante estudiante = new Estudiante(true,"Juan","234567654");
        
        String datos = estudiante.mostrarDatos();
        
        System.out.println(datos);
    }
}
