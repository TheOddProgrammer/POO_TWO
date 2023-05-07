package ClaseOne;

public class Estudiante extends Persona{
    private boolean esSubsidiado;

    public Estudiante(boolean esSubsidiado, String nombre, String telefono) {
        super(nombre, telefono);
        this.esSubsidiado = esSubsidiado;
    }

    public boolean isEsSubsidiado() {
        return esSubsidiado;
    }

    public void setEsSubsidiado(boolean esSubsidiado) {
        this.esSubsidiado = esSubsidiado;
    }
    
    //Metodos
    
    @Override
    public String mostrarDatos() {
        return super.mostrarDatos()+"\nSubsidiado: "+esSubsidiado;
    }
}
