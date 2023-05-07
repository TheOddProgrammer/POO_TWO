package Herencia;

public class Estudiante extends Persona{
    private int codigoEstudiante;
    private float notaFinal;

    public Estudiante(int codigoEstudiante, float notaFinal, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }
    
    public void mostrarDatos() {
        System.out.println("Nombre: "+nombre+
                "\nApellido: "+getApellido()+
                "\nEdad: "+getEdad()+
                "\nCodigo: "+codigoEstudiante+
                "\nNota: "+notaFinal);
    }
    
    @Override
    public void comer() {
        System.out.println("Yo solo Puedo Comer En Descansos!!");
    }
    
}
