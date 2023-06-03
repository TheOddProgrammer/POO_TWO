package Restaurante;

public class Estudiante extends Persona{
    private String codEstudiantil;
    private final int PRECIO_ALMUERZOS = 8000;

    public Estudiante(String codEstudiantil, String name, String id) {
        super(name, id);
        this.codEstudiantil = codEstudiantil;
    }

    public String getCodEstudiantil() {
        return codEstudiantil;
    }

    public void setCodEstudiantil(String codEstudiantil) {
        this.codEstudiantil = codEstudiantil;
    }

    @Override
    public String toString() {
        return "El Estudiante " + super.name + " con documento " + super.id;
    }
    
    @Override
    public int calcularPrecio() {
        return this.PRECIO_ALMUERZOS - 6000;
    }
}
