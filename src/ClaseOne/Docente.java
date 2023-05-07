package ClaseOne;
//POJO - VO
public class Docente extends Persona{
    private String codigo;
    private boolean mayor;
    
    public static final int MAYOR_EDAD = 18;

    public Docente(String codigo, String nombre, String telefono) {
        super(nombre, telefono);
        this.codigo = codigo;
    }

    public Docente(String codigo, String nombre) {
        super(nombre);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public boolean isMayor() {
        return mayor;
    }

    public void setMayor(boolean mayor) {
        this.mayor = mayor;
    }
    
    //Metodos
    
    public void calcularEdad(int edad) {
        this.mayor = edad>=Docente.MAYOR_EDAD;
    }
    
    public boolean calcularEdad(String edad) {
        int edadConvertida = Integer.parseInt(edad);
        return edadConvertida >= MAYOR_EDAD;
    }
    
    @Override
    public String mostrarDatos() {
        return super.mostrarDatos()+"\nCodigo: "+codigo;
    }
    
    
}
