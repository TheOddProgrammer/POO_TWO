package Presentar;

public class Vehiculo {
    protected String matricula;
    protected String tipo;

    public Vehiculo(String matricula, String tipo) {
        this.matricula = matricula;
        this.tipo = tipo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String demostrar(){
        return "Soy un Aparato capaz de Brindar Transporte de tipo: "+tipo+
                "\ncon Matricula: "+matricula;
    }
}
