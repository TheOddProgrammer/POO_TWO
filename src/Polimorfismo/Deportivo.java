package Polimorfismo;

public class Deportivo extends Vehiculo {
    private int cilindraje;

    public Deportivo(int cilindraje, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
    
    @Override
    public String mostrarDatos(){
        return super.mostrarDatos()+"\nCilindraje: "+cilindraje;
    }
}
