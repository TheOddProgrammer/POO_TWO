/* Clases y Metodos Abstractos
- Se utilizan solo como super clases
- No se pueden instanciar objetos
- Sirve para proporcionar una super clase apropiada a partir de la cual
heredan otras clases
- Son metodos y clases genericos que no sabes como se utilizan en ciertos 
sectores como la Alimentacion en Seres Vivos, todos se alimentan, pero
no el como
*/
package H_Abstractos;
public class Main {
    public static void main(String[] args) {
        //SerVivo serVivo = new SerVivo(); * No se puede Instanciar al Ser Abstracta
        //Animal animal = new //Animal();
        
        Planta planta = new Planta();
        planta.alimentarse();
        
        Carnivoro carnivoro = new Carnivoro();
        carnivoro.alimentarse();
    }
}
