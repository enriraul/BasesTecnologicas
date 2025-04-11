
public class Main {
    public static void main(String[] args) {

        // Persona persona = new Persona("Pepe","Perez",45);
        // persona.Presentar();

        // Persona persona1 = new Persona("Ana","Gonzales", 40);
        // persona1.Presentar();

        //Ejemplo Clase:

        Motor motor = new Motor("Electrico",500);
        Auto auto = new Auto("Toyota","Corolla",motor);
        auto.MostrarInfoAuto();
    }
}
