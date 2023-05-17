/*
Conceptos Aplicados en Herencia
- Extends se usa para indicar que una Plantilla es Hija de Otra
- Super se usa para indicar que ciertos atributos pertenecen al Padre en el metodo Constructor
- La Sobrecarga de Metodos o Funciones es volver a utilizar metodos con el mismo nombre y mismos parametros para realizar acciones distintas
- La sobreescritura se utiliza para facilitar el trabajo de la Persona en FrontEnd
*/

package Herencia;

public class Main {

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante(192104,4.6f,"Juan","Duran",18);
        estudiante.mostrarDatos();
        estudiante.comer();
    }
    
}
