package Polimorfismo;

public class Furgoneta extends Vehiculo {
    private int carga;

    public Furgoneta(int carga, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    @Override
    public String mostrarDatos(){
        return super.mostrarDatos()+"\nCarga: "+carga;
    }
}
