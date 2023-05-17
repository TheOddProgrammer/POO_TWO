/*
Polimorfismo = Muchas Formas
-En una relacion de tipo herencia, un objeto de la superclase puede 
almacenar a un objeto de cualquiera de sus subclases
- Esto significa que la Superclase es compatible con los tipos
que derivan de ella. Pero no al reves.
- El Objeto Principal actuara dependiendo la Instancia de sus hijos
 */

package Polimorfismo;
public class Main {
    public static void main(String[] args) {
        Vehiculo misVehiculos[] = new Vehiculo[4];
        
        misVehiculos[0] = new Vehiculo("Nissan","OUO-28F","30A4");
        misVehiculos[1] = new Turismo(4,"UWU-30P","Cadilac","Z-Region");
        misVehiculos[2] = new Deportivo(200,"REZ-75F","Ferrari","Alpha");
        misVehiculos[3] = new Furgoneta(700,"VEL-19R","Ford","Retro2");
        
        for (Vehiculo misVehiculo : misVehiculos) {
            System.out.println(misVehiculo.mostrarDatos());
            System.out.println("");
        }
    }
}
