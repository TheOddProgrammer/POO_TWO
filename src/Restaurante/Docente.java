package Restaurante;

public class Docente extends Persona{
    private int tipo;
    private final int PRECIO_ALMUERZOS = 8000;
    private final int ID_PLANTA = 1;

    public Docente(int tipo, String name, String id) {
        super(name, id);
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        if (this.tipo == 1) {
            return "El Docente " + super.name + " con documento " + super.id;
        } else {
            return "El Docente " + super.name + " con documento " + super.id;
        }
    }
    
    @Override
    public int calcularPrecio() {
        if (this.tipo == this.ID_PLANTA) {
            return this.PRECIO_ALMUERZOS - 3000;
        } else {
            return this.PRECIO_ALMUERZOS - 1000;
        }
    }
}
