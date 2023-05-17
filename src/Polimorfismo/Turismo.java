package Polimorfismo;

public class Turismo extends Vehiculo{
    private int puertas;

    public Turismo(int puertas, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    
    @Override
    public String mostrarDatos(){
        return super.mostrarDatos()+"\nPuertas: "+puertas;
    }
}
