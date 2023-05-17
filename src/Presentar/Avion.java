package Presentar;

public class Avion extends Vehiculo{
    private int numeroElices;

    public Avion(int numeroElices, String matricula, String tipo) {
        super(matricula, tipo);
        this.numeroElices = numeroElices;
    }
    
    @Override
    public String demostrar() {
        return super.demostrar()+" pues soy un Avion con "+numeroElices+" de elices.";
    }
    
}
